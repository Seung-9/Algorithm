import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static int N, M;
    public static int[] nums, arr;
    public static boolean[] visited;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[M];
        visited= new boolean[N];

        st = new StringTokenizer(br.readLine(), " ");
        arr = new int[N]; // 2번째 줄
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 내림차순으로 정렬
    }

    public static void rec_func(int k) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(nums[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 0; i < N; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    nums[k] = arr[i];
                    rec_func(k + 1);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        rec_func(0);
        System.out.println(sb);
    }
}