import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static int N, M;
    public static int[] nums;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[M];
    }

    public static void rec_func(int start, int k) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(nums[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = start; i <= N; i++) {
                nums[k] = i;
                rec_func(nums[k], k + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        rec_func(1,0);
        System.out.println(sb);
    }
}