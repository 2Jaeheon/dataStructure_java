package loop.alternative;

public class Alternative1 {

    public static void main(String[] args) {
        int n = 13;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
    }
    //문제점 1. 반복 할 때마다 if문을 실행해야함.
    //문제점 2. 변경할 때 유연하게 대응하기가 어려움
}
