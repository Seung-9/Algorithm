import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        int sol = n - 543;
        System.out.println(sol);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}