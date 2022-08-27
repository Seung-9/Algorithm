package BackJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJune14888 {
    static int N; // 숫자의 개수
    static int[] num; // 숫자를 담는 배열
    static int max = Integer.MIN_VALUE; // 최댓값
    static int min = Integer.MAX_VALUE; // 최솟값
    static int[] operator = new int[4]; // 연산자 배열

    // 입력 메서드
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        num = new int[N + 1];
        for(int i = 0; i < N; i++)  num[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++)  operator[i] = Integer.parseInt(st.nextToken());
    }

    // 재귀호출 메서드
    public static void rec_func(int k, int number) {
        if(k == N) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        for(int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--; // 사용된 연산자의 횟수 차감
                switch (i) {
                    case 0: rec_func(k+1, number + num[k]); break;
                    case 1: rec_func(k+1, number - num[k]); break;
                    case 2: rec_func(k+1, number * num[k]); break;
                    case 3: rec_func(k+1, number / num[k]); break;
                }
                operator[i]++; // 재귀 호출이 끝나면 연산자 횟수 다시 원래대로
            }
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        rec_func(1, num[0]);
        System.out.println(max);
        System.out.println(min);
    }
}
