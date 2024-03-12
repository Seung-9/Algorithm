import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 알고리즘 설계
 * STEP 1. N 값 입력 받기
 * STEP 2. 재귀함수 구현하기
 *  STEP 2-1. N개의 원판 중 N-1 개의 원판을 2번 으로 옮기기. 횟수는 rec_func(n-1)
 *  STEP 2-2. N-1 개의 원판을 2번째로 옮겼으면 가장 큰 원판을 3번으로 이동하기 위한 횟수는 rec_func(1)
 *  STEP 2-3. N-1 개의 원판을 다시 3번으로 옮기기 위한 횟수는 rec_func(n-1)
 * STEP 3. StringBuilder 사용해서 최소값, 순서 append 해주고 화면에 출력하기
 */
public class Main {

    static int N;
    static int k = Integer.MAX_VALUE;
    static StringBuilder sb = new StringBuilder();


    // STEP 1. N 값 입력 받기
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    /**
     * n = 원판의 개수
     * start = 시작 위치
     * mid = 목적지로 옮기기 위한 중간 위치
     * to = 목적지
     */
    // STEP 2. 재귀함수 구현
    public static void rec_func(int N, int start, int mid, int to) {
        if (N == 1) { // 만약 원판의 수가 하나라면 ?
            sb.append(start + " " + to + "\n");
        } else {
            // STEP 2-1. N - 1 개의 원판을 1 번째에서 2 번째 기둥으로 이동하기
            rec_func(N - 1, start, to, mid);

            // STEP 2-2. STEP 2-1 을 거치면 하나의 원판을 제외한 모든 원판이 2 번째로 이동되었으니 N 개의 원판을 1 번째에서 3번쨰로 이동
            sb.append(start + " " + to + "\n");

            // STEP 2-3. STEP 2-2에서 1 번째에 남은 마지막 원판을 3 번째로 옮겼기 때문에 2 번째에 있는 원판을 3 번째로 이동하기 위해 재귀호출
            rec_func(N - 1, mid, start, to);
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        sb.append((int) Math.pow(2, N) - 1).append("\n");
        rec_func(N, 1, 2, 3);
        System.out.println(sb);
    }
}
