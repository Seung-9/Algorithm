import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[6];

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();
        int a = arr[0], b = arr[1], c = arr[2], d = arr[3], e = arr[4], f = arr[5];

        for(int i = -999; i < 1000; i++) {
            for(int j = -999; j < 1000; j++) {
                if(((a * i) + (b * j) == c) && ((d * i) + (e * j) == f)) {
                    sb.append(i).append(" ").append(j);
                    break;
                }
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println();
    }
}
