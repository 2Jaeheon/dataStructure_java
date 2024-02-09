package array.maxOfArray;

import java.util.*;

public class MaxOfRand {

    static int maxOfArrayRand(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]:" + height[i]);
        }

        System.out.println("최댓값은 " + maxOfArrayRand(height) + "입니다.");
    }

    //Random클래스를 만든 후
    //rand에 대해서 난수를 생성하는 nextInt를 호출
    //nextInt(n) 의 반환값은 0 ~ n-1
}