class Solution {
    int even = 0;
    int odd = 0;
    public int[] solution(int[] num_list) {
        int[] answer = check(num_list);
        return answer;
    }
    
    static int[] check(int[] numbers) {
        int even = 0;
        int odd = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }
}