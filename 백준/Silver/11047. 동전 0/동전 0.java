import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int coinNum;
        int totalCoinCount = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] <= K) {
                coinNum = K / arr[i];
                totalCoinCount += coinNum;
                K -= coinNum * arr[i];
            } else continue;
        }

        System.out.println(totalCoinCount);
    }
}