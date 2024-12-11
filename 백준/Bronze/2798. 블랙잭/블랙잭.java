import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Integer[] number;
    static int N;
    static int M;

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        number = new Integer[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solution() {
        Arrays.sort(number, Collections.reverseOrder());
        int maxSum = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                for(int k = j+1; k < N; k++) {
                    int sum = 0;
                    sum = number[i] + number[j] + number[k];
                    if(maxSum < sum && sum <= M) {
                        maxSum = sum;
                    }
                    if(sum == M) {
                        break;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}