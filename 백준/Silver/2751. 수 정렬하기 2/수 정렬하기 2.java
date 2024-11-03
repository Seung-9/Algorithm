import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> dataList = new ArrayList<Integer>();

        for(int i = 0; i < N; i++) dataList.add(Integer.parseInt(br.readLine()));

        Collections.sort(dataList);

        for(int i : dataList) sb.append(i).append('\n');
        System.out.println(sb);
    }
}