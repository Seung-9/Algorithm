import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int min = 64;
    static boolean[][] arr;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                if(line.charAt(j) == 'B') {
                    arr[i][j] = true;
                } else {
                    arr[i][j]= false;
                }
            }
        }

    }

    public static void solution() {
        for(int i = 0; i < N-7; i++) {
            for(int j = 0; j < M-7; j++) {
                check(i, j);
            }
        }
        System.out.print(min);
    }

    public static void check(int x, int y) {
        int row = x + 8;
        int col = y + 8;
        int count = 0;
        boolean first = arr[x][y];
        for(int i = x; i < row; i++) {
            for(int j = y; j < col; j++) {
                if(arr[i][j] != first) {
                    count++;
                }
                first = !first;
            }
            first = !first;
        }
        count = Math.min(count, 64-count);

        min = Math.min(min, count);
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}