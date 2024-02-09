package array.others;

public class ArraySumForIn {

    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        double sum = 0;

        //enhanced for statement
        for (double i : a) { //변수 i는 인덱스를 나타내는 것이 아닌 실수값인 스캔할 때 선택한 요소를 나타냄
            sum += i;
        }

        //배열의 요솟수를 조사하는 수고를 덜 수 있습니다.
        //배열의 모든 요소를 빼놓지 않고 스캔할 수 있습니다.
        //Iterator와 같은 방법으로 스캔할 수 있습니다.

        System.out.println("모든 요소의 합은 " + sum + "입니다.");
    }
}
