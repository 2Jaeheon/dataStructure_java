package loop.sum;

public class SumFor {

    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값: 10");

        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
