import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    static int A, B;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    public static void solution() {
        if(A > B) {
            System.out.print(">");
        } else if(A == B) {
            System.out.print("==");
        } else {
            System.out.print("<");
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}