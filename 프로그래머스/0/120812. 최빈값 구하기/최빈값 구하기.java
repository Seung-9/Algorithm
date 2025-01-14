class Solution {
    public int solution(int[] array) {
        int[] num = new int[1001];
        int max = 0;
        int maxIndex = -1;
        boolean isDuplicate = false;
        
        for (int i = 0; i < array.length; i++) {
            num[array[i]]++;
            if (max < num[array[i]]) {
                max = num[array[i]];
                isDuplicate = false;
                maxIndex = array[i];
            } else if (max == num[array[i]]) {
                isDuplicate = true;
            }
        }
        if (isDuplicate) {
            return -1;
        }
        return maxIndex;
    }
}