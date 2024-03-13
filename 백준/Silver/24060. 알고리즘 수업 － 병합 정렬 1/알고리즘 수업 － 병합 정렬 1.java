import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

    static int N, K, count = 0;
    static int[] arr;
    static int[] tmp;
    static int result = -1;

    // 입력값 받기
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
    }

    public static void merge_sort(int[] arr, int start, int end) {
        if (K < count) { // 저장 횟수가 K 보다 작으면 안 됨
            return;
        }

        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(arr, start, mid); // 왼쪽
            merge_sort(arr, mid + 1, end); // 오른쪽
            merge(arr, start, mid, end); // 병합 정렬
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) { // 왼쪽보다 오른쪽이 더 크면
                tmp[t++] = arr[i++]; // tmp에 arr[i] 저장하고 인덱스 증가
            } else { // 오른쪽이 왼쪽보다 더 크면
                tmp[t++] = arr[j++]; // tmp에 arr[j] 저장하고 인덱스 증가
            }
        }

        // 만약 오른쪽에 더이상 값이 없으면
        while (i <= mid) {
            tmp[t++] = arr[i++]; // tmp에 arr[i] 저장하고 인덱스 증가
        }

        // 만약 왼쪽에 더이상 값이 없으면
        while (j <= end) {
            tmp[t++] = arr[j++]; // tmp에 arr[j] 저장하고 인덱스 증가
        }

        i = start;
        t = 0;

        // 만약 다 끝났으면
        while (i <= end) {
            count++;
            if (count == K) {
                result = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        merge_sort(arr, 0, arr.length - 1);
        System.out.println(result);
    }
}
