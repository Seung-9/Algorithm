import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S;
    static int num[];
    static int count = 0;

    // 입력값을 받아오는 함수
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        num = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void rec_func(int k, int value) {
        if(k == N + 1) {
            if(value == S) {
                count++;
            }
        } else {
            rec_func(k + 1, value + num[k]);    // 값을 포함 했을 떄
            rec_func(k + 1, value);      // 값을 포함하지 않을 떄
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        rec_func(1, 0);
        if(S == 0) {
            count--;
        }
        System.out.println(count);
    }
}