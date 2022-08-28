package BackJune.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJune2231 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int M;

    public static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        int answer = 0;

        for(int i = 1; i < N; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if(sum + i == N) {
                answer = i;
                break;
            }
        }
        System.out.print(answer);
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
