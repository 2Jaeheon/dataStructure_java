package loop.alternative;

public class Alternative2 {

    public static void main(String[] args) {
        int n = 13;

        for (int i = 0; i < n / 2; i++) {
            System.out.print("+-");
        }
        if (n % 2 != 0) {
            System.out.print("+");
        }
    }
}
