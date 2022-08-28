package BackJune.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BackJune2798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Integer[] number;
    static int N;
    static int M;
    static boolean visited[];
    static int max = 0;

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        number = new Integer[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void rec_func(int cnt, int sum) {
        Arrays.sort(number, Collections.reverseOrder());
        if(cnt == 3) {
            if(sum <= M) {
                max = Math.max(max, sum);
            }
        } else {
            for(int i = 0; i < N; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    rec_func(cnt+1, sum + number[i]);
                    visited[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        rec_func(0, 0);
        System.out.println(max);
    }
}