import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    static int N, K;
    static String[] words;
    static boolean[] learned = new boolean[26];
    static int answer = 0;

    public static void dfs(int k, int index) {
        if (k == K-5) {
            int possibleCount = countPossibleWords();
            answer = Math.max(answer, possibleCount);
        } else {
            for (int i = index; i < 26; i++) {
                if(!learned[i]){
                    learned[i] = true;
                    dfs(k + 1, i);
                    learned[i] = false;
                }
            }
        }
    }

    public static int countPossibleWords() {
        int count = 0;
        for (String word : words) {
            boolean canRead = true;
            int wordsLen = word.length();
            for (int j = 0; j < wordsLen; j++) {
                if (!learned[word.charAt(j) - 'a']) {
                    canRead = false;
                    break;
                }
            }
            if (canRead) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temps = br.readLine().split(" ");
        N = Integer.parseInt(temps[0]);
        K = Integer.parseInt(temps[1]);

        if (K < 5) {
            System.out.println(0);
            return;
        } else if (K == 26) {
            System.out.println(N);
            return;
        }

        words = new String[N];
        learned = new boolean[26];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            words[i] = temp.substring(4, temp.length() - 4);
        }

        learned['a' - 'a'] = true;
        learned['n' - 'a'] = true;
        learned['t' - 'a'] = true;
        learned['i' - 'a'] = true;
        learned['c' - 'a'] = true;

        dfs(0,0);
        System.out.println(answer);
    }
}