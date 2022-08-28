package BackJune.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJune2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        // 1. 산술평균
        double sum = 0.0;
        for(int i = 0; i < N; i++) {
            sum += num[i];
        }
        sb.append((int)(Math.round(sum / N))).append("\n");

        // 2. 중앙값
        Arrays.sort(num);
        int mid = N / 2;
        sb.append(num[mid]).append("\n");
        // 3. 최빈값
        HashMap<Integer, Integer> list = new HashMap<>();
        ArrayList<Integer> mode = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            if(list.containsKey(num[i])) { // key 값이 존재하면 벨류값 += 1
                list.put(num[i], list.get(num[i]) + 1);
            } else { // key값이 존재하지 않으면 num[i] 키 값을 추가하고 벨류값 = 1
                list.put(num[i], 1);
            }
        }
        int maxNum = Collections.max(list.values());
        for(Map.Entry<Integer, Integer> arr: list.entrySet()) {
            if(arr.getValue() == maxNum) {
                mode.add(arr.getKey());
            }
        }
        Collections.sort(mode);
        if(mode.size() > 1) {
            sb.append(mode.get(1)).append("\n");
        } else {
            sb.append(mode.get(0)).append("\n");
        }

        // 4. 범위 (최댓값 - 최소값)
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            if(max < num[i])    max = num[i];
            if(min > num[i])    min = num[i];
        }
        sb.append(max - min);

        System.out.println(sb);
    }
}