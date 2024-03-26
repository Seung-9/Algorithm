import java.util.ArrayList;

public class Solution {
   public static String solution(String new_id) {
        String answer = "";

        // 소문자로 치환 후 char 배열에 저장
        char[] charArray = new_id.toLowerCase().toCharArray();

        // ArrayList 에 저장
        ArrayList<Character> newId = new ArrayList<>();
        for (Character c : charArray)   newId.add(c);

        // 알파벳, 숫자, -, _, . 를 제외한 모든 문자 제거
        for (int i = 0; i < newId.size(); i++) {
            boolean check = false;

            // 숫자, -, _ 이면 패스
            if('a' <= newId.get(i) && newId.get(i) <= 'z') check = true;
            else if ('0' <= newId.get(i) && newId.get(i) <= '9') check = true;
            else if (newId.get(i) == '-' || newId.get(i) == '_')    check = true;

            // . 이면 패스
            else if (newId.get(i) == '.')   check = true;

            // 모든 조건을 통과하지 못하면 해당 문자 제거
            if (!check) {
                newId.remove(i);
                i--; // ArrayList 는 빈 공간이 생기면 알아서 앞으로 떙겨오기 때문에 i-- 해줘야됨. i 번째 값을 삭제했기 때문에
            }
        }

        // . 이 연속해서 나오면 하나로 치환 한 후 뒤에 i 를 1 증가
        for (int i = 0; i < newId.size(); i++) {
            if (newId.get(i) == '.') {
                while (i + 1 < newId.size() && newId.get(i + 1) == '.') { // i + 1 이 size 보다 크면 안 됨.
                    newId.remove(i + 1);
                }
            }
        }

        // . 이 처음이나 끝에 존재하면 제거
        if (newId.get(0) == '.')    newId.remove(0);
        else if (newId.get(newId.size() - 1) == '.')    newId.remove(newId.size() - 1);

        // 빈 문자열이면 a 추가
        if (newId.isEmpty())    newId.add('a');

        // 길이가 16 이상이면 15개까지만 남기고 다 삭제
        while (newId.size() > 15)   newId.remove(newId.size() - 1);
//        if (newId.size() >= 15) {
//            newId.subList(0, 15);
//        }

        // 만약 . 이 마지막에 존재하면 제거
        if (newId.get(newId.size() - 1) == '.') newId.remove(newId.size() - 1);

        // 길이가 2 이하면 길이가 3이 될 때까지 마지막 문자를 반복해서 붙임
        if (newId.size() < 3) {
            int size = newId.size();
            char last = newId.get(size - 1); // 마지막 문자
            for (int i = size; i <= 2; i++) {
                newId.add(last);
            }
        }

        for (Character c : newId) {
            answer += Character.toString(c);
        }
        return answer;
    }
}