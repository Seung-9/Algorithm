import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M + 1];
    }

    public static void solution(int k) {
        if(k == M + 1) {
            for(int i = 1; i <= M; i++)  sb.append(arr[i]).append(" ");
            sb.append("\n");
        } else {
            for(int i = arr[k-1] + 1; i <= N; i++) {
                arr[k] = i;
                solution(k + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution(1);
        System.out.println(sb);
    }
}
