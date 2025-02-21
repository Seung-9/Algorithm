import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;

public class Main {

    static String str;
    static Stack<Character> stack = new Stack<>();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
    }

    public static void solution() {
        int sum = 0;
        int value = 1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
                value *= 2;
            } else if (ch == '[') {
                stack.push(ch);
                value *= 3;
            } else {
                if (stack.isEmpty()) {
                    System.out.print(0);
                    return;
                }
                if (ch == ')') {
                    if (stack.peek() == '(') {
                        if (str.charAt(i - 1) == '(') {
                            sum += value;
                        }
                        stack.pop();
                        value /= 2;
                    } else {
                        System.out.print(0);
                        return;
                    }
                } else if (ch == ']') {
                    if (stack.peek() == '[') {
                        if (str.charAt(i - 1) == '[') {
                            sum += value;
                        }
                        stack.pop();
                        value /= 3;
                    } else {
                        System.out.print(0);
                        return;
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.print(0);
        } else {
            System.out.print(sum);
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}