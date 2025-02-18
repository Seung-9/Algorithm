import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int N;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        arr.sort(Collections.reverseOrder());
    }

    public static void solution() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int value = arr.get(i) * (i + 1);
            max = Math.max(max, value);
        }
        System.out.print(max);
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}