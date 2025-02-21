import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int W, H;
    static int[] block;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        block = new int[W];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < W; i++) {
            block[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solution() {
        int sum = 0;
        for (int i = 1; i < W - 1; i++) {
            int leftStand = 0;
            int rightStand = 0;
            for (int j = i; j >= 0; j--) {
                if (leftStand < block[j]) {
                    leftStand = block[j];
                }
            }
            for (int j = i; j < W; j++) {
                if (rightStand < block[j]) {
                    rightStand = block[j];
                }
            }
            int stand = Math.min(leftStand, rightStand);
            sum += stand - block[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}