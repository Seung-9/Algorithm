package BackJune.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJune1436 {

    static int N;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        int count = 0;
        int num = 0;
        String sol = "666";
        while(count != N) {
            num++;
            if(String.valueOf(num).contains(sol)) {
                count++;
            }
        }
        System.out.println(num);

    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}