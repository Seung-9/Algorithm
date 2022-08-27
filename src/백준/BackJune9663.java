package BackJune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BackJune9663 {
    static int cnt = 0;
    public boolean isAvailable(ArrayList<Integer> candidate, int y) {
        int x = candidate.size();
        for(int i = 0; i < x; i++) {
            // 수직 조건 및 대각선 조건
            if((candidate.get(i) == y) || (Math.abs(candidate.get(i) - y) == x - i)) {
                return false;
            }
        }
        return true;
    }
    public void NQueen(int N, int x, ArrayList<Integer> currentCandidate) {
        if(x == N) {
            cnt++;
        }
        for(int i = 0; i < N; i++) {
            // 대각선 조건 만족 할 경우
            if(this.isAvailable(currentCandidate, i) == true) {
                currentCandidate.add(i);
                this.NQueen(N, x + 1, currentCandidate);
                // 조건 만족 못하면 remove - 가지치기
                currentCandidate.remove(currentCandidate.size() - 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BackJune9663 test = new BackJune9663();
        test.NQueen(N, 0, new ArrayList<>());
        System.out.println(cnt);
    }
}
