import static java.lang.Math.*;

public class ufff {
    public static void main(String[] args) {
        double h;
        double sum;
        for (double n = 10; n <= 10000; n *= 10) {
            h = 1 / n;
            sum = 0;
            double a = 1;
            for (int i = 1; i <= n; i++) {
                a += h;
                sum += (sin(pow(-a, 2) + 5 * a) + 4 * a) * h;
            }
            System.out.println("n: " + n + "     h: " + h + "    S: " + sum + "     -6.74    " + abs(sum - 6.74));
        }
    }
}
