import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int M, N;
    static int min = 10000;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            int square = i*i;
            if(square <= N && square >= M) {
                sum += square;
                min = Math.min(min, square);
            }
        }
        if(sum == 0) {
            sum = -1;
            System.out.println(sum);
        } else {
            sb.append(sum).append("\n").append(min);
            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}