import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, x, cnt = 0;
    static int[] arr;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++)  arr[i] = Integer.parseInt(st.nextToken());

        x = Integer.parseInt(br.readLine());
    }

    public static boolean lower_bound(int left, int right, int x) {
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == x)   return true;
            if(arr[mid] <= x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void solution() {
        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            int result = x - arr[i];
            if(result > i && lower_bound(i + 1, n - 1, result))   cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
