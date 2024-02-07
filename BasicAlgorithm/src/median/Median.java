package median;

public class Median {

    static int median(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 2;

        int median = median(a, b, c);

        System.out.println("median : " + median);
    }
}
