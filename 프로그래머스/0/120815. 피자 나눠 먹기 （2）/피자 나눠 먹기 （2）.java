class Solution {
    public int solution(int n) {
        int answer = 0;
        // 최소공배수 구하는 문제 -> 최대공약수 구하고 두 곱을 나누면 됨
        if (n % 6 == 0) {
            answer = n / 6;
        } else {
            answer = (n * 6) / gcd(n, 6);
            answer /= 6;
        }
        return answer;
    }
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}