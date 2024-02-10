package search.binarySearch;

import java.util.*;

public class BinarySearchTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num]; //요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요");

        System.out.println("x[0] : ");
        x[0] = stdIn.nextInt();

        //반복해서 오름차순으로 데이터 입력받기
        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]); //바로 앞의 요소보다 작으면 다시 입력받음
        }

        //key 값을 입력받음
        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        //이진탐색해서 인덱스 반환
        int idx = Arrays.binarySearch(x, key);

        if (idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
        }
    }
}
