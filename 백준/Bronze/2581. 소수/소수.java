import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int M, N;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = M; i <= N; i++) {
            if(decimalCheck(i)) {
                sum += i;
                min = Math.min(min, i);
            }
        }
        if(min == Integer.MAX_VALUE) {
            min = -1;
            System.out.print(min);
        } else {
            sb.append(sum).append("\n").append(min);
            System.out.println(sb);
        }
    }

    public static boolean decimalCheck(int num) {
        if(num == 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}