public class Main {
    static boolean[] arr = new boolean[100001];

    public static void selfNumCheck(int num) {
        int sum = num;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        arr[sum] = true;
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();
        int n = 1;

        while(n != 10000) {
            selfNumCheck(n);
            n++;
        }

        for(int i = 1; i <= 10000; i++) {
            if(arr[i] == false) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        solution();
    }
}