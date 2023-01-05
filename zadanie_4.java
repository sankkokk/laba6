import static java.lang.Math.*;
import java.util.Scanner;

public class ufff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        double a = in.nextDouble();
        if (a > 1) throw new IllegalArgumentException("durachek?");
        int ask = 1;
        while (ask == 1){
            System.out.println("Input sc");
            int sc = in.nextInt();
            if (sc >=2 && sc <= 10 && a<1 && a>0){
                ChangeScale(a,sc);
            }
            else {System.out.println("Not correct input");}
            System.out.println("Do u want to change sc 1-yes, else - number no");
            ask = in.nextInt();
        }
    }
    public static void ChangeScale(double a, int sc){
        double i;
        double result = 0;
        for (int j = 1;j <= 10; j++ ){
            i = a*sc;
            result += (int)i * pow(0.1,j);
            a = i - (int)i;
        }
        System.out.println(result);
    }
}
