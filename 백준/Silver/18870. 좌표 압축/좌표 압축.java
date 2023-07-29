import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];
        int[] sorted = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        // 내림차순으로 정렬
        Arrays.sort(sorted);

        // HashMap에 정렬된 값과 index값 추가
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            if(!map.containsKey(sorted[i])) {
                map.put(sorted[i], cnt);
                cnt++;
            }
        }

        for(int i = 0; i < N; i++) {
            if(map.containsKey(origin[i])) {
                sb.append(map.get(origin[i]) + " ");
            }
        }
        System.out.println(sb);
    }
}
