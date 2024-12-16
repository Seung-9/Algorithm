import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int T;
    static String[] word;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        word = new String[T];

        for(int i = 0; i < T; i++)  word[i] = br.readLine();
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++)  sb.append(word[i].charAt(0)).append(word[i].charAt(word[i].length() - 1)).append("\n");
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}