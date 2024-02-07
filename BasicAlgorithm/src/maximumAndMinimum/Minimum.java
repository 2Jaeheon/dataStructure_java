package maximumAndMinimum;

public class Minimum {

    static int min3(int a, int b, int c) {
        int minimum = a;
        if (minimum > b) {
            minimum = b;
        }
        if (minimum > c) {
            minimum = c;
        }
        return minimum;
    }
}
