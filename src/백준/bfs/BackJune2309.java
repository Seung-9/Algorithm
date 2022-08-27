package BackJune.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BackJune2309 {

    static int[] height = new int[9];
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited = new boolean[9];
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(height);
    }

    public static void solution(int index, int cnt) {
        if(cnt == 7) {
            int sum = 0;
            for(int i = 0; i < height.length; i++) {
                if(visited[i]) {
                    sb.append(height[i]).append("\n");
                    sum += height[i];
                }
            }
            if(sum == 100) {
                System.out.println(sb);
                System.exit(0);
            }
        }
        sb.setLength(0);
        for(int i = index; i < height.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                solution(index + 1, cnt + 1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        solution(0, 0);
    }
}