package loop.printStars;

import java.util.*;

public class PrintStars2 {

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

        for (int i = 0; i < n / w; i++) {
            //    System.out.println("*".repeat(w));
        }

        //나머지 출력부분
        int rest = n % w;
        if (rest != 0) {
            //    System.out.println("*".repeat(rest));
        }

    }
}
