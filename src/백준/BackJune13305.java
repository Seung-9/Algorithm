package BackJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJune13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] length = new long[N - 1];
        long[] price = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N - 1; i++) {
            length[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long currentPrice = price[0];

        for(int i = 0; i < N - 1; i++) {
            if(currentPrice > price[i]) {
                currentPrice = price[i];
            }
            sum += (currentPrice * length[i]);
        }
        System.out.println(sum);
    }
}
