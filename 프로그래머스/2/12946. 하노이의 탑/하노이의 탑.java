import java.util.ArrayList;

// 가장 큰 원판을 3번으로 옮기기 위해서 n 개의 원판 중 n - 1 개의 원판을 2번으로 옮겨야됨. => rec_func(n - 1)
// n - 1 개의 원판을 다시 3번으로 옮기기 => rec_func(n - 1)
class Solution {

    static ArrayList<int[]> arr = new ArrayList<>();

    public static int[][] solution(int n) {

        // n 개의 원판을 1번에서 2번을 거쳐 3번으로 이동
        rec_func(n, 1, 2, 3);

        int[][] answer = new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

    /**
     * n = 원판의 개수
     * start = 시작 위치
     * mid = 목적지로 옮기기 위한 중간 위치
     * to = 목적지
     */
    public static void rec_func(int n, int start, int mid, int to) {
        if (n == 1) { // n이 1이면
            arr.add(new int[]{start, to});
        } else {
            // n - 1 개의 원판을 1 -> 2 ( 2번으로 가기 위해선 3번을 거쳐야됨 )
            rec_func(n - 1, start, to, mid);

            // 2번으로 모두 이동됐으면 처음 위치와 중간 위치를 answer에 추가
            arr.add(new int[]{start, to});

            // n - 1 개의 원판을 2 -> 3
            rec_func(n - 1, mid, start, to);
        }
    }
}