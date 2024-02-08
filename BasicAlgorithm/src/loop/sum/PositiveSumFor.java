package loop.sum;

import java.util.*;

public class PositiveSumFor {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        //양수일 때까지 반복
        do {
            System.out.println("n의 값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
