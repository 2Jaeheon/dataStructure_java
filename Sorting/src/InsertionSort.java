import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1,5,7,3,8,2};
        int len = arr.length;

        insertion(arr, len);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int temp = arr[i];
            //하나씩 감소시키면서 선택된 원소가 선택된 원소 바로 이전의 원소보다 더 작으면 교환함
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
}
