import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

    static int N, K;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    public static void solution() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arr.add(i);
            }
        }
        if (arr.size() < K) {
            System.out.print(0);
        } else {
            System.out.print(arr.get(K - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}