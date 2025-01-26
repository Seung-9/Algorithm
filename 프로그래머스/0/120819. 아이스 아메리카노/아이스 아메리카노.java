class Solution {
    public int[] solution(int money) {
        int[] answer;
        answer = new int[]{money / 5500, money % 5500};
        return answer;
    }
}