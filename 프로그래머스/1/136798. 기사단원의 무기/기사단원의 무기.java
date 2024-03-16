class Solution {
    
    // number = 인원 수
    // limit = 제한 수치
    // power = 제한 수치를 초과한 기사의 공격력
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 약수 개수 구하고, 제한 수치를 초과하는지 체크
        for (int i = 1; i <= number; i++) {
            int count = 0; // 약수의 개수
            int sqrtNum = (int) Math.sqrt(i);

            // 제곱근까지만 약수의 개수 구하기
            for (int j = 1; j <= sqrtNum; j++) {
                if (i % j == 0) {
                    count += 2;
                }
            }

            // 제곱근은 +2를 하는 것이 아닌데 위에서 제곱근까지 +2 를 하니까 제곱근일 경우는 -1을 해줘야함.
            if (sqrtNum * sqrtNum == i) {
                count--;
            }

            // 약수의 개수 > 제한 수치 이면 공격력을 power 로 설정
            int attack = count > limit ? power : count;
            answer += attack;
        }
        
        return answer;
    }
}