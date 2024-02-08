package loop.sumVerbose;

import java.util.*;

public class SumVerbose2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        int sum = 0;

        do {
            System.out.print("n의 값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }

        System.out.print(n + " = ");
        sum += n;
        System.out.print(sum);
    }
}
