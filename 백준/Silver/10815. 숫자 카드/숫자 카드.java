import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] arr;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)  arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            int lower = lower_bound(arr, num);
            sb.append(lower).append(" ");
        }
        System.out.println(sb);
    }

    public static int lower_bound(int[] arr, int num) {
        int left = 0, right = arr.length;

        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] == num) return 1;
            if(arr[mid] >= num) right = mid;
            else    left = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        input();
    }
}
