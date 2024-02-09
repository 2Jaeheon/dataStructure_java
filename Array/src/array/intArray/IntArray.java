package array.intArray;

public class IntArray {

    public static void main(String[] args) {
        int[] a = new int[5];
        //배열의 구성요소는 자동으로 0으로 초기화됨.

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
