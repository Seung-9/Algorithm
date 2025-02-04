import java.io.IOException;

class Solution {
    public String solution(String my_string, int n) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                char ch = my_string.charAt(i);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}