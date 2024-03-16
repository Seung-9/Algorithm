import java.util.Arrays;

class Solution {
   public int solution(int n, int[] lost, int[] reserve) {
       int answer = 0;
       int count = n - lost.length;
       Arrays.sort(lost);
       Arrays.sort(reserve);
       
       // 여벌을 가져온 학생이 도난당했을 경우
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    count++;
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;
                }
            }
        }

        // 체육복을 빌려줄 수 있는 지 체크
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] < n) { // 여분을 가진 학생이 전체 학생 수보다 작을 경우
                    if (reserve[i] + 1 == lost[j] || reserve[i] - 1 == lost[j]) { // 여분을 가진 학생 +-1 이 도난 당한 학생의 번호와 같으면 count 증가
                        count++;
                        lost[j] = -1; // 해결 했으니까 초기화
                        reserve[i] = -1;
                        break;
                    }
                } else if (reserve[i] == n && reserve[i] - 1 == lost[j]){ // 여분을 가진 학생이 마지막 학생인 경우
                    count++;
                }
            }
        }

        answer = count;
        return answer;
    }
}