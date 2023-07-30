import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    static String id;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        id = br.readLine();
    }

    public static void solution() {
        String newId = id + "??!";
        System.out.println(newId);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}