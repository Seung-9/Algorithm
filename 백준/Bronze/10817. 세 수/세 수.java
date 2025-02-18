import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static int[] arr = new int[3];
    
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
    }
    
    public static void solution() {
        System.out.print(arr[1]);
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}