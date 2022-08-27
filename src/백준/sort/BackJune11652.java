package BackJune.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BackJune11652 {
    static int N;
    static long[] num;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num = new long[N];
        for(int i = 0; i < N; i++) {
            num[i] = Long.parseLong(br.readLine());
        }
    }

    public static void solve() {
        Arrays.sort(num);

        long number = num[0];
        int maxCount = 1;
        int count = 1;

        for(int i = 1; i < num.length; i++) {
            if(num[i] == num[i - 1])    count++;
            else    count = 1;

            if(maxCount < count) {
                number = num[i];
                maxCount = count;
            }
        }
        System.out.println(number);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}