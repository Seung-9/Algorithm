class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n*(n + 1) / 2];
        int x = 0, y = -1;
        int num = 1;
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    y++;
                } else if (i % 3 == 1) {
                    x++;
                } else {
                    y--;
                    x--;
                }
                arr[y][x] = num++;
            }
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) break;
                answer[index++] = arr[i][j];
            }
        }
        return answer;
    }
}
