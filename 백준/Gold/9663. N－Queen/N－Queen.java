import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int cnt = 0;
    static int[] y;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        y = new int[N];
    }

    public static boolean validCheck(int x) {
        for(int i = 0; i < x; i++) {
            if(y[x] == y[i])    return false;
            else if(Math.abs(x - i) == Math.abs(y[x] - y[i])) return false;
        }
        return true;
    }
    public static void rec_func(int x) {
        if(x == N) {
            cnt++;
        } else {
            for(int i = 0; i < N; i++) {
                y[x] = i;
                if(validCheck(x)) {
                    rec_func(x + 1);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        rec_func(0);
        System.out.println(cnt);
    }
}