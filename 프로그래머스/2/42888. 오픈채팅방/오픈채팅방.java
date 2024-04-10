import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// record = 닉네임 변경 로그
// 구현 문제 ?
// 닉네임 변경은 Enter 혹은 Change 로만 가능 -> 그럼 Enter or Change 가 이루어질 떄 닉네임을 갱신해주기 => Map ?
class Solution {
    public String[] solution(String[] record) {

        Map<String, String> userMap = new HashMap<>(); // 유저 ID와 닉네임을 매핑
        ArrayList<String> logList = new ArrayList<>(); // [ userId  Enter or Leave ] 로 이루어진 문자열 Ex) uid1234 Enter

        // userMap 에 userId, nickName 저장
        // userId + Enter or Leave 로 이루어진 새로운 문자열 만들기
        for (String log : record) {

            StringTokenizer st = new StringTokenizer(log, " "); // 공백을 기준으로 문자열을 자름
            String participation = st.nextToken(); // Enter or Leave
            String userId = st.nextToken(); // 유저 id

            // Enter 또는 Change 이면 닉네임 갱신
            if (participation.equals("Enter") || participation.equals("Change")) {
                String nickname = st.nextToken();
                userMap.put(userId, nickname); // 유저 닉네임 갱신
            }

            if (participation.equals("Enter") || participation.equals("Leave")) {
                logList.add(userId + " " + participation);
            }
        }

        // 정답을 담을 리스트 생성
        ArrayList<String> result = new ArrayList<>();


        for (String log : logList) {
            StringTokenizer st = new StringTokenizer(log, " ");
            String userId = st.nextToken();
            String participation = st.nextToken();

            String nickname = userMap.get(userId); // userId 에 해당하는 닉네임을 가져옴

            if (participation.equals("Enter")) {
                result.add(nickname + "님이 들어왔습니다.");
            } else if (participation.equals("Leave")) {
                result.add(nickname + "님이 나갔습니다.");
            }
        }

        // 결과 리스트를 문자열 배열로 변환
        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}