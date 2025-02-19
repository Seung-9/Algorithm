import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int A, B;
    static ArrayList<Integer> num = new ArrayList<>();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= B; i++) {
            for (int j = 0; j < i; j++) {
                num.add(i);
            }
        }
    }

    public static void solution() {
        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += num.get(i);
        }
        System.out.print(sum);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}