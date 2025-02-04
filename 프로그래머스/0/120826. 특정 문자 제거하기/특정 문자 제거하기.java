import java.io.IOException;

class Solution {
    public String solution(String my_string, String letter) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        char letterChar = letter.charAt(0);
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch != letterChar) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}