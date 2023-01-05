import java.util.Scanner;
import static java.lang.Math.*;

public class ufff {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x;
        System.out.println("Введите значение x");
        while ((x = in.nextDouble()) >= 1){
            System.out.println("Ошибка! Введите другое значение x");
        }
        int k;
        double s;
        for (double ep = 0.0001; ep <= 0.01; ep*=10){
            s = 0;
            k = 1;
            while (exp(pow(-x, 2)) > ep){
                s += (pow(-1,k) *Math.pow(x,2 * k))/(factorial1(k));
                k++;
                if(k > 20) break;
            }
            System.out.println(s + " " + ep);
        }
    }
    public static int factorial1(int enter1){
        int res1 = 1;
        for (int i = 1; i <= enter1; i ++){
            res1 *= i;
        }
        return res1;
    }
}
