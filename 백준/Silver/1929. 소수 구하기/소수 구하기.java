import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        boolean isPrime = true;

        if(N == 1) {
            N += 1;
        }
        else if (N == 0) {
            N += 2;
        }

        for(int i = N; i <= M; i++) {
            for(int j = 2; j*j <= i; j++) {
                if( i%j == 0 ) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                sb.append(i).append("\n"); // StringBuilder 객체 사용
            }
            isPrime = true;
        }

        System.out.println(sb);

    }

}