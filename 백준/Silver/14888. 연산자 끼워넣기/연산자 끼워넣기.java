import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int[] operator = new int[4];
    static int[] nums;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) nums[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < 4; i++)  operator[i] = Integer.parseInt(st.nextToken());
    }

    public static void rec_func(int k, int value) {
        if(k == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            for(int i = 0; i < 4; i++) {
                if(operator[i] > 0) {
                    operator[i]--;
                    switch (i) {
                        case 0 : rec_func(k + 1, value + nums[k]); break;
                        case 1 : rec_func(k + 1, value - nums[k]); break;
                        case 2 : rec_func(k + 1, value * nums[k]); break;
                        case 3 : rec_func(k + 1, value / nums[k]); break;
                    }
                    operator[i]++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        rec_func(1, nums[0]);
        System.out.println(max);
        System.out.println(min);
    }
}