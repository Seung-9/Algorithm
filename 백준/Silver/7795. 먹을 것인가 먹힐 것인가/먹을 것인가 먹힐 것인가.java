import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int T, N, M;
    static int[] A, B;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        B = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(B);
    }

    public static int lower_bound(int A) {
        int result = -1, left = 0, right = M - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (A > B[mid]) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result + 1;
    }

    public static void solution() {
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            cnt += lower_bound(A[i]);
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            input();
            solution();
        }
    }
}