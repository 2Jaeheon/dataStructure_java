import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 3, 8};
        int length = 5;
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n) {
        //뒤에 두 원소를 비교하는데 앞에서는 하나씩 제거해줘야함.
        int exchg = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    exchg++;
                }
            }
            if (exchg == 0) {
                break;
            }
        }
    }

    static void bubbleSort2(int[] arr, int n) {
        //뒤에 두 원소를 비교하는데 앞에서는 하나씩 제거해줘야함.
        int k = 0;

        while (k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    last = j; // 교환을 마친 마지막 원소
                }
            }
            k = last; //교환을 마친 마지막 원소를 k에 넣어서 다음 수행할 패스의 범위 제한
        }
    }
}
