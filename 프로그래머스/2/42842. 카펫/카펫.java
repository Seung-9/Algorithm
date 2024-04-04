// 가로 * 세로 = brown + yellow
// 가로 >= 세로
// 약수 구하기
class Solution {

    public int[] solution(int brown, int yellow) {

        int sum = brown + yellow;
        int min = Integer.MAX_VALUE;

        int[] answer = new int[2];

        for (int i = 3; i < sum; i++) {
            int width = sum / i;
            if (width >= i && width * i == sum) {
                if ((width - 2) * (i - 2) == yellow) {
                    answer = new int[]{width, i};
                }
            }
        }
        return answer;
    }

}