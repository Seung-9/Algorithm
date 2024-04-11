// 한 번 사용한 객실은 퇴실 시간을 기준으로 10분간 청소
class Solution {

    // 한 번 사용한 객실은 퇴실 시간을 기준으로 10분간 청소
    public static int solution(String[][] book_time) {
        int answer = 0;
        int[] time = new int[1450]; // 2350 분 이후로는 예약을 안 받으니까 2351로 설정

        for(int i = 0; i < book_time.length; i++) {
            String[] startTemp = book_time[i][0].split(":");
            int startTime = Integer.parseInt(startTemp[0]) * 60 + Integer.parseInt(startTemp[1]);

            String[] endTemp = book_time[i][1].split(":");
            int endTime = Integer.parseInt(endTemp[0]) * 60 + Integer.parseInt(endTemp[1]) + 10;

            time[startTime] += 1;
            time[endTime] -= 1;
        }
        
        for(int i = 1; i < time.length; i++) {
            time[i] += time[i - 1];
            answer = Math.max(answer, time[i]);
        }

        return answer;
    }
}