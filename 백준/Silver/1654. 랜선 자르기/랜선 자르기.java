import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int K, N;
    static long right;
    static int[] arr;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[K];

        for(int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(right < arr[i]) right = arr[i];
        }
    }

    public static void BinarySearch() {
        long left = 0;
        right++;

        while(left < right) {
            long mid = (left + right) / 2;
            long count = 0;

            for(int i = 0; i < K; i++)  count += (arr[i] / mid);
            if(count < N)   right = mid;
            else    left = mid + 1;
        }
        System.out.println(left - 1);
    }

    public static void main(String[] args) throws IOException {
        input();
        BinarySearch();
    }
}
