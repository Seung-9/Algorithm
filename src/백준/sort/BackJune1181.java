package BackJune.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BackJune1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<String> dataList = new ArrayList<>();

        for(int i = 0; i < N; i++)  dataList.add(br.readLine());

        Collections.sort(dataList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        sb.append(dataList.get(0)).append('\n');

        for(int i = 1; i < N; i++) {
            if(!dataList.get(i).equals(dataList.get(i - 1))) {
                sb.append(dataList.get(i)).append('\n');
            }
        }

        System.out.println(sb);
    }
}