import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int k;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

    public static int solution() {
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                count++;
            }
            if(count == k) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }
}