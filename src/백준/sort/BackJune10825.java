package BackJune.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJune10825 {
    static int N;
    static Score[] student;
    static StringBuilder sb = new StringBuilder();
    public static class Score implements Comparable<Score> {
        String name;
        int korean, english, math;

        @Override
        public int compareTo(Score o) {
            // 국어 점수가 감소하는 순서로(내림차순)
            if(this.korean != o.korean)  return o.korean - this.korean;
            // 국어 점수가 같으면 영어 점수가 증가하는 순서로
            if(this.english != o.english)   return this.english - o.english;
            // 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
            if(this.math != o.math) return o.math - this.math;
            // 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
            return this.name.compareTo(o.name);
        }
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        student = new Score[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            student[i] = new Score();
            student[i].name = st.nextToken();
            student[i].korean = Integer.parseInt(st.nextToken());
            student[i].english= Integer.parseInt(st.nextToken());
            student[i].math = Integer.parseInt(st.nextToken());
        }
    }

    public static void sortFunc(Score[] list) {
        Arrays.sort(student);
        for(int i = 0; i < student.length; i++) {
            sb.append(list[i].name).append('\n');
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) throws IOException {
        input();
        sortFunc(student);
    }
}
