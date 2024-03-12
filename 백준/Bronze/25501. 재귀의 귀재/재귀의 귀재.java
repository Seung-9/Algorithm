import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N, count;
    static String[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new String[N];

        for (int i = 0; i < N; i++) arr[i] = br.readLine();
    }

    public static int rec_func(String s, int start, int end) {
        if (start >= end) {
            return 1;
        } else if (s.charAt(start) != s.charAt(end)) {
            return 0;
        } else {
            count++;
            return rec_func(s, start + 1, end - 1);
        }
    }


    public static void main(String[] args)  throws IOException {
        input();
        for (int i = 0; i < N; i++) {
            count++;
            int result = rec_func(arr[i], 0, arr[i].length() - 1);
            sb.append(result + " " + count).append("\n");
            count = 0;
        }
        System.out.println(sb);
    }
}
