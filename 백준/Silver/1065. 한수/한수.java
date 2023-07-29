import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static int N;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    public static void solution() {
        int cnt = 99;
        if(N < 100) {
            System.out.print(N);
        } else {
            for(int i = 100; i <= N; i++) {
                if(sequenceCheck(i) == true) {
                    cnt++;
                }
            }
            System.out.print(cnt);
        }
    }

    public static boolean sequenceCheck(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while(num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        int tolerance = list.get(1) - list.get(0);
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i+1) - list.get(i) == tolerance) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}