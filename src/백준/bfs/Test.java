package BackJune.bfs;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("5");
        list.add("30");
        list.add("23");
        list.add("21");

        // String[] arr = new String[list.size()];
        // list.toArray(arr);
        String[] arr = list.toArray(new String[list.size()]);

        for(String num : arr) {
            System.out.println(num + " "); // 5 30 23 21
        }
    }
}
