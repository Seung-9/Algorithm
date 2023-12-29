import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] selected;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();

    // 입력값을 받아오는 함수
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];
        isUsed = new boolean[N + 1];
    }

    // 재귀함수를 이용하여 1~N까지를 N자리 수만큼 받아온다.
    // 만약 N자리 수만큼 받아왔으면 해당 값을 출력.
    // 그렇지 않다면 재귀 호출을 통해 N자리 수만큼 숫자를 채워나간다.
    // 사용된 숫자는 0으로 초괴화
    // 만약 selected[i]가 1이면 이미 사용된 숫자이므로 selected[i+1]
    public static void rec_fun(int k) {
        if(k == M + 1) {
            for(int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for(int i = 1; i <= N; i++) {
                if(isUsed[i] == true) continue;
                selected[k] = i;
                isUsed[i] = true;
                rec_fun(k+1);
                selected[k] = 0;
                isUsed[i] = false;

            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        rec_fun(1);
        System.out.println(sb);
    }
}