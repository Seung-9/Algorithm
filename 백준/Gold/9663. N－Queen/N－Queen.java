import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int[] arr; // i 번째 행에 놓인 퀸의 위치를 나타내는 배열임
    static int N, count;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
    }

    // k 번 ~ N 번째 행에 퀸을 놓는 경우의 수 구하기
    public static void rec_func(int k) {
        // 만약 k가 N이 되면 N번째 까지 퀸을 다 놓은 거니까 count 증가
        if (k == N) {
            count++;
        } else {
            // k번째 행, i 번째 열에 퀸을 배치
            for (int i = 0; i < N; i++) {
                // 배치하기 전에 이전까지 배치한 퀸들과 서로 공격이 가능한지 미리 체크
                boolean possible = true;
                for (int j = 0; j < k; j++) {
                    // k 번쨰 행, i 번째 열에 퀸을 놓을 건데, 이전에 놓았던 (j, arr[j]) 와 비교하여 공격이 가능한지를 체크
                    if (attackable(k, i, j, arr[j])) { // 참이면 공격이 가능한 것.
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    arr[k] = i;
                    rec_func(k + 1);
                    arr[k] = 0;
                }
            }
        }
    }

    // 가로, 세로, 대각선 공격이 가능한 지 체크하는 함수
    public static boolean attackable(int k, int i, int j, int arr) {
        if (i == arr) { // 같은 열에 존재하면 공격이 가능함. true 리턴
            return true;
        }
        if (k + i == j + arr) {
            return true;
        }
        if (k - i == j - arr) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        input();
        rec_func(0);
        System.out.println(count);
    }
}