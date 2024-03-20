import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1,7,6,9,0};
        int length = arr.length;

        selectionSort(arr, length);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i; //아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스 저장

            //반복 돌려서 최소값 찾기
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            //아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
