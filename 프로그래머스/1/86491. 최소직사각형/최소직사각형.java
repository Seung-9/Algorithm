class Solution {
    
    public int solution(int[][] sizes) {
        int answer = 0, wmax = 0, hmax = 0;
        
        // 가로, 세로 길이 비교 후 더 큰 걸 왼쪽으로 이동
        // wmax 에 가로 길이 중 최댓값 저장
        // hmax 에 세로 길이 중 최댓값 저장
        // wmax * hmax = answer
        for (int i = 0; i < sizes.length; i++) {
            // 만약 가로가 세로보다 더 길면 가로 세로 위치 변경
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if (sizes[i][0] > wmax)  wmax = sizes[i][0];
            if (sizes[i][1] > hmax) hmax = sizes[i][1];
        }
        answer = wmax * hmax;
        return answer;
    }
}