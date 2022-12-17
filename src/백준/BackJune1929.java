package 백준;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class BackJune1929 {

    static int N, M;
    static boolean check = false;


    // 입력값
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    // 해결
    public static void solution() {
        StringBuilder sb = new StringBuilder();
        if(N == 1) {
            N += 1;
        }
        else if (N == 0) {
            N += 2;
        }
        // 소수란 1과 자기 자신만을 약수로 가진 수이다.
        for(int i = N; i <= M; i++) {
            for(int j = 2; j < i; j++) { // 소수 체크
                if(i % j == 0) {
                    check = true;
                    break;
                }
            }
            if(!check)  sb.append(i).append("\n");
            check = false;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
