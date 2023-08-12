import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static ArrayList<Integer>[] list;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 1; i <= N; i++) {
            int number, color;
            st = new StringTokenizer(br.readLine(), " ");
            number = Integer.parseInt(st.nextToken());
            color = Integer.parseInt(st.nextToken());
            list[color].add(number);
        }
    }

    public static void solution() {
        int sum = 0;

        for(int color = 1; color <= N; color++) {
            Collections.sort(list[color]);
        }

        for(int color = 1; color <= N; color++) {
            for(int j = 0; j < list[color].size(); j++) {
                if(j == 0) {
                    sum += list[color].get(j+1) - list[color].get(j);
                } else if(j == list[color].size() - 1) { // 오른쪽에 더이상 값이 없음
                    sum += list[color].get(j) - list[color].get(j - 1);
                } else {
                    sum += Math.min(list[color].get(j + 1) - list[color].get(j), list[color].get(j) - list[color].get(j - 1));
                }
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}