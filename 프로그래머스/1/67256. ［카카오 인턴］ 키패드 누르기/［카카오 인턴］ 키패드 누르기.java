class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 시작 위치 (*, #)
        int left = 10, right = 12;
        
        for (int i = 0; i < numbers.length; i++) {
            
            // 1, 4, 7은 왼손, 3, 6, 9는 오른손
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                left = numbers[i]; // 왼손 위치 갱신
                answer += "L";
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                right = numbers[i]; // 오른손 위치 갱신
                answer += "R";
            } else {
                // 맨해튼으로 거리 비교
                int leftLength = calc(left, numbers[i]);
                int rightLength = calc(right, numbers[i]);
                
                // 만약 거리가 같으면 왼손잡이, 오른손잡이로 구분
                if (leftLength == rightLength) {
                    if (hand.equals("right")) {
                        right = numbers[i];
                        answer += "R";
                    } else {
                        left = numbers[i];
                        answer += "L";
                    }
                } else if (leftLength > rightLength) {
                    right = numbers[i];
                    answer += "R";
                } else {
                    left = numbers[i];
                    answer += "L";
                }
            }    
        }
        return answer;
    }
    
    public static int calc(int hand, int number) {
        if (number == 0)    number = 11;
        if (hand == 0) hand = 11;
        
        
        int handX = (hand - 1)  / 3;
        int handY = (hand - 1)  % 3;
        
        int numberX = (number - 1)  / 3;
        int numberY = (number - 1)  % 3;
        
        return Math.abs(handX - numberX) + Math.abs(handY - numberY);
    }
}