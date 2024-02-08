package loop.sum;

public class SumWhile {

    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: 10");
        int n = 10;

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
