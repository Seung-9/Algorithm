import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static Person[] person;
    static StringBuilder sb = new StringBuilder();

    public static class Person {
        int age;
        String name;

        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void input() throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        person = new Person[N];

        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            person[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }
    }

    public static void solution() {
        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        for(int i = 0; i < person.length; i++)  sb.append(person[i].age).append(" ").append(person[i].name).append("\n");
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println(sb);
    }
}