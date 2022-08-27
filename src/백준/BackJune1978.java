package 백준;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJune1978 {

    static int N, count;
    static int[] arr;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solution() {
        for(int i = 0; i < arr.length; i++) {
            decCheck(arr[i]);
        }
        System.out.print(count);
    }

    public static void decCheck(int num) {
        count++;
        if(num == 1) {
            count--;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                count--;
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}