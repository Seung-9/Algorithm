package BackJune.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BackJune1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String num = br.readLine();
        char[] arr = new char[num.length()];

        for(int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
        }

        Arrays.sort(arr);

        for(int i = arr.length; i > 0; i--) {
            sb.append(arr[i-1]);
        }
        System.out.println(sb);
    }
}