import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    
    static int[] num;
    static int average = 0;
    
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = new int[5];
        for(int i = 0; i < 5; i++)    num[i] = Integer.parseInt(br.readLine());
    }
    
    public static void solution() {
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(num); // 정렬
        for(int i = 0; i < num.length; i++)    average += num[i];
        average /= 5;
        sb.append(average).append("\n").append(num[2]);
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}