import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] B;
    static int[] P;

    static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        B = new int[N][2];
        P = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            B[i][0] = Integer.parseInt(st.nextToken());
            B[i][1] = i;
        }
    }

    public static void sortFunc() {
        Arrays.sort(B, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < B.length; i++) {
            P[B[i][1]] = i;
        }
        for(int i = 0; i < P.length; i++) {
            sb.append(P[i]).append(" ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        input();
        sortFunc();
    }
}
