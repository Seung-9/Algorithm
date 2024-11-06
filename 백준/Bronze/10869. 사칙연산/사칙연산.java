import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
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
        StringBuilder sb = new StringBuilder();
        
        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        int div = A / B;
        int rem = A % B;
        
        sb.append(sum).append("\n").append(sub).append("\n").append(mul).append("\n").append(div).append("\n").append(rem);
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}