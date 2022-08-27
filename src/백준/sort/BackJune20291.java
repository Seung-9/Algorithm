package BackJune.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJune20291 {

    static int N;
    static HashMap<String, Integer> file = new HashMap<>();
    static ArrayList<String> data = new ArrayList<>();
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String name = st.nextToken();
            if(file.containsKey(name)) {
                file.put(name, file.get(name) + 1);
            } else {
                file.put(name, 1);
            }
        }

        for(String key : file.keySet()) {
            data.add(key);
        }
        Collections.sort(data);
        for(String key : data) {
            sb.append(key).append(" ").append(file.get(key)).append("\n");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        input();
    }
}
