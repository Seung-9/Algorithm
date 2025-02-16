import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static int n;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        int count = 0;
        while(true) {
            if(n % 5 == 0) {
                count += n / 5;
                System.out.print(count);
                break;
            } else {
                n -= 2;
                count++;
            }
            if(n < 0) {
                System.out.print(-1);
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}