import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int cnt = 0;

    public static int fibonaciFunc(int n){
        if(n == 1 || n == 2) {
            cnt++;
            return 1;
        } else {
            return fibonaciFunc(n - 1) + fibonaciFunc(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        int DPcnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] index = new int[n];
        index[0] = 0;
        index[1] = 1;
        fibonaciFunc(n);
        for(int i = 2; i < n; i++) {
            DPcnt++;
            index[i] = index[i - 1] + index[i - 2];
        }

        System.out.println(cnt + " " + DPcnt);
    }
}
