import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[][] people;

    public static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        people = new int[N][2];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int cnt = 1;
            if(i == N - 1) {
                for(int j = i; j >= 0; j--) {
                    if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                        cnt += 1;
                    }
                }
            } else {
                for(int j = 0; j < N; j++) {
                    if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                        cnt += 1;
                    }
                }
            }
            sb.append(cnt).append(" ");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}