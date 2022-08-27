package BackJune.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BackJune2750 {

    public static ArrayList<Integer> quickSort(ArrayList<Integer> dataList) {
        if(dataList.size() <= 1) {
            return dataList;
        }

        int pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for(int i = 1; i < dataList.size(); i++) {
            if(pivot > dataList.get(i)) {
                leftArr.add(dataList.get(i));
            } else {
                rightArr.add(dataList.get(i));
            }
        }

        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(quickSort(leftArr));
        mergedList.addAll(Arrays.asList(pivot));
        mergedList.addAll(quickSort(rightArr));

        return mergedList;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> dataList = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++)  dataList.add(Integer.parseInt(br.readLine()));

        for(int i : quickSort(dataList)) System.out.println(i);
    }
}