package recursion;

public class EuclidGCD {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        System.out.println("gcd(22, 8) = " + gcd(22, 8));
        System.out.println("gcd(8, 22) = " + gcd(8, 22));
    }

    //재귀를 사용하지 않은 gcd2메소드
    static int gcd2(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
