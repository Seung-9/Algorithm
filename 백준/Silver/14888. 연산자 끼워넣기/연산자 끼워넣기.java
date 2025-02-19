import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {

    static int N;
    static int[] num;
    static int[] operator = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solution(int index, int value) {
        if(index == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            for (int i = 0; i < 4; i++) {
                if (operator[i] > 0) {
                    operator[i]--;
                    switch (i) {
                        case 0: solution(index + 1, value + num[index]); break;
                        case 1: solution(index + 1, value - num[index]); break;
                        case 2: solution(index + 1, value * num[index]); break;
                        case 3: solution(index + 1, value / num[index]); break;
                    }
                    operator[i]++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution(1, num[0]);
        System.out.println(max);
        System.out.println(min);
    }
}