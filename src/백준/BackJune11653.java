package 백준;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BackJune11653 {

    static int N;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();
        int n = 2;
        while(N != 1) {
            if(N % n == 0) {
                sb.append(n).append("\n");
                N /= n;
            } else {
                n++;
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}