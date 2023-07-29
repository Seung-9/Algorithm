import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N, k; // 학생 수, 상을 받는 학생 수
    static Integer[] arr;
    
    // 입력값을 받아오는 함수
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new Integer[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)  arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr, Collections.reverseOrder());
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(arr[k - 1]);
    }
}
