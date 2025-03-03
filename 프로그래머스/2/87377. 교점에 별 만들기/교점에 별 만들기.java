import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    static ArrayList<Point> points = new ArrayList<>();

    public String[] solution(int[][] line) {
        // 교점 구해서 points에 추가
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        // x, y가 최대 구하기
        Point maximum = getMaximumPoint(points);
        Point minimum = getMinimumPoint(points);

        // 최대 최소를 이용해서 두 점 사이의 거리 구하기
        // 단, +1 해줘야됨
        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        // 배열에 . 을 다 채워주기
        char[][] arr = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                arr[i][j] = '.';
            }
        }
        // 교점에 해댱하는 좌표에만 * 찍어주기
        for (Point point : points) {
            int x = (int) (point.x - minimum.x);
            int y = (int) (maximum.y - point.y);
            arr[y][x] = '*';
        }
        String[] result = new String[arr.length]; 
        for (int i= 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
       }
       return result;
    }


    // Point 객체 생성
    public static class Point {
        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // 교점 구하기
    private Point intersection(long a1, long b1, long c1,
                               long a2, long b2, long c2) {
        double x = (double) (b1 * c2 - c1 * b2) / (a1 * b2 - b1 * a2);
        double y = (double) (c1 * a2 - a1 * c2) / (a1 * b2 - b1 * a2);
        
        // 교점이 정수인 경우에만
        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }
        
        return new Point((long) x, (long) y);
    }

    // x, y 최대, 최소 구하기
    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point point : points) {
            if (point.x > x) {
                x = point.x;
            }
            if (point.y > y) {
                y = point.y;
            }
        }
        return new Point(x, y);
    }

    private Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point point : points) {
            if (point.x < x) {
                x = point.x;
            }
            if (point.y < y) {
                y = point.y;
            }
        }
        return new Point(x, y);
    }
}