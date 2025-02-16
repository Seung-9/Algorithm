import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static int n;
    static int[] coins = new int[]{500, 100, 50, 10, 5, 1};

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        int money = 1000 - n;
        int count = 0;
        for(int i = 0; i < coins.length; i++) {
            count += money / coins[i];
            money %= coins[i];
        }
        System.out.print(count);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}