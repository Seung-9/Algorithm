class Solution {
    
    static int max = Integer.MIN_VALUE;
    
    public static int solution(int[][] triangle) {
        int size = triangle.length;
        
        int dp[][] = new int[size][size];
        dp[0][0] = triangle[0][0];
        
        for (int i = 1; i < size; i++) {
            for(int j = 0; j <= i; j++) {
                if (i == 1) {
                    dp[i][j] = dp[0][0] + triangle[i][j];
                } else {
                    if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + triangle[i][j]; // 왼쪽
                    } else {
                        dp[i][j] = dp[i - 1][j] + triangle[i][j]; // 왼쪽
                        int left = dp[i][j];
                        dp[i][j] = dp[i - 1][j - 1] + triangle[i][j]; // 오른쪽
                        int right = dp[i][j];
                        
                        if (left < right) dp[i][j] = right;
                        else dp[i][j] = left;
                    }
                }
                if (max < dp[i][j]) max = dp[i][j];
            }
        }
        return max;
    }
}