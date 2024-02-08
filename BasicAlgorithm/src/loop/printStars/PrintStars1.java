package loop.printStars;

import java.util.*;

public class PrintStars1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;

        System.out.println("*을 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.print("n의 값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w의 값: ");
            w = stdIn.nextInt();
        } while (w <= 0 || w >= n);

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i % w == w - 1) { //w가 5일 때 i가 4, 9, 14일 때 줄바꿈을 함.
                System.out.println();
            }
        }
        if (n % w != 0) {
            System.out.println();
        }

    }
}
