import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    static String word;
    static int[] cnt = new int[26];
    static int max = 0;
    static char result = '?';

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine().toUpperCase();
    }

    public static void solution() {
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'A';
            cnt[index]++;
            if(cnt[index] > max) {
                max = cnt[index];
                result = word.charAt(i);
            } else if(cnt[index] == max)    result = '?';
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}