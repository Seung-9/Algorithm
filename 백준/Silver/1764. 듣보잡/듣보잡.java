import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N, M, cnt;
    static String[] arr1, arr2;
    static ArrayList<String> result = new ArrayList<>();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr1 = new String[N];
        arr2 = new String[M];

        for(int i = 0; i < N; i++)  arr1[i] = br.readLine();

        for(int i = 0; i < M; i++)  arr2[i] = br.readLine();
    }

    public static void lower_bound(String[] arr1, String arr2) {
        int left = 0, right = arr1.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr1[mid].equals(arr2)) {
                cnt++;
                result.add(arr2);
            }

            if(arr1[mid].compareTo(arr2) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr1);

        for(int i = 0; i < arr2.length; i++) {
            lower_bound(arr1, arr2[i]);
        }

        Collections.sort(result);

        sb.append(cnt).append("\n");
        for(int i = 0; i < cnt; i++)    sb.append(result.get(i)).append("\n");

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
