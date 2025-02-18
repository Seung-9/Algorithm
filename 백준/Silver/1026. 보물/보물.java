import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static Integer[] A, B;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        A = new Integer[N];
        B = new Integer[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(A);

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            B[i] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(B, Collections.reverseOrder());
    }

    public static void solution() {
        int answer = 0;
        for(int i = 0; i < N; i++) {
            answer += A[i] * B[i];
        }
        System.out.print(answer);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}