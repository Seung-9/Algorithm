import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int N, count;
    static int MIN = Integer.MAX_VALUE;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    // 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
    // 5kg, 3kg 중 5kg을 많이 써야 최소 개수를 구할 수 있음
    public static void solution() {
        while (true) {
            // while문 돌 때 처음에 N == 0인지 체크 후 최솟값 설정
            if (N == 0) {
                MIN = count;
                break;
            }

            // 1. 5로 나눌 수 있는지 체크 ( 최대한 5로 나눌 수 있어야 최솟 개수를 구할 수 있음 )
            if (N % 5 == 0) {
                count++;
                N -= 5;
            } else {
                // 2. 5로 나눌 수 없는 경우
                N -= 3;
                count++;
            }

            // 만약 N 이 0보다 작으면 최솟값 = -1
            if (N < 0)  {
                MIN = -1;
                break;
            }

        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println(MIN);
    }
}



// 봉지의 최소 개수를 구하는 메서드
// 시간초과
    /*
    public static void rec_func(int sum, int count) {
        if (sum == N) {
            MIN = Math.min(count, MIN);
            return;
        }

        if (sum > N) {
            return;
        }
        rec_func(sum + 5, count++);
        rec_func(sum + 3, count++);
    }

     */
