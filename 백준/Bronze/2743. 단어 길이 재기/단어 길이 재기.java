import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String word;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();
    }

    public static void solution() {
        System.out.println(word.length());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}