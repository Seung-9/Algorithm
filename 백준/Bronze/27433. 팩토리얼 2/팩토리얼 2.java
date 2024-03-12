import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * 알고리즘 설계
 * STEP 1. N! 입력받기
 * STEP 2. 팩토리얼 계산을 위한 재귀함수 호출
 * STEP 3. 결과를 화면에 출력
 */
public class Main {

    static int N;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    public static long rec_func(int N) {
        if (N > 0) {
            return N * rec_func(N - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(rec_func(N));
    }
}
