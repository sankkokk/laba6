import java.util.Scanner;
import static java.lang.Math.*;

public class ufff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите K");
        double k = in.nextDouble();
        System.out.println("Введите P");
        double p = in.nextDouble();
        System.out.println("Введите N");
        double n = in.nextDouble();
        double temp = p/n;
        double ans = ceil(k/temp);
        System.out.println("он будет сдавать долги " + ans + " месяца(ев)");
    }
}
