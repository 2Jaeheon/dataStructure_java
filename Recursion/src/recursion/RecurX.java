package recursion;

import java.util.Scanner;
import stackExample.IntStack;

public class RecurX {

    public static void main(String[] args) {
        int n = 4;
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                //n값을 n-2로 업데이트하고 메서드의 시작지점으로 돌아갑니다.
                continue;
            }
            break;
        }
    }
}
