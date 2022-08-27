package BackJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJune1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalSum = Integer.MAX_VALUE;

        String num = br.readLine();

        StringTokenizer subtraction = new StringTokenizer(num, "-");

        while(subtraction.hasMoreTokens()) {
            num = subtraction.nextToken();
            int addSum = 0;
            StringTokenizer addition = new StringTokenizer(num, "+");
            while(addition.hasMoreTokens()) {
                int addNum = Integer.parseInt(addition.nextToken());
                addSum += addNum;
            }
            if(totalSum == Integer.MAX_VALUE) {
                totalSum = addSum;
            } else {
                totalSum -= addSum;
            }
        }
        System.out.println(totalSum);
    }
}
