import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] arr;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void input() throws IOException {
        int N;
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)  arr[i] = Integer.parseInt(st.nextToken());
    }

    public static boolean lower_bound(int[] M, int X) {
        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(X == M[mid]) return true;
            if(X > M[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void solution() throws IOException {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            if(lower_bound(arr, Integer.parseInt(st.nextToken())))  sb.append("1").append("\n");
            else    sb.append("0").append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
