import java.util.*;

class Solution {
    
    // 큐 두개 크기 비교하면서 큰 쪽이 작은 쪽한테 넘겨주면 될듯
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        long sum1 = 0, sum2 = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        // 큐1, 큐2 길이 구하고, 큐에 집어넣기
        for (int i = 0; i < queue1.length; i++) {
            sum1 += (long) queue1[i];
            q1.add(queue1[i]);
            
            sum2 += (long) queue2[i];
            q2.add(queue2[i]);
        }
        
        
        while (sum1 != sum2) {
            if (answer > queue1.length * 4) return -1;
            if (sum1 > sum2) { // 큐1 > 큐2 이면 큐1 poll 해서 큐2에 넣기
                int num = q1.poll();
                q2.add(num);
                sum1 -= num;
                sum2 += num;
            } else if (sum1 < sum2) {
                int num = q2.poll();
                q1.add(num);
                sum1 += (long) num;
                sum2 -= (long) num;
            } else {
                return answer;
            }
            answer++;
        }
        
        return answer;
    }
}