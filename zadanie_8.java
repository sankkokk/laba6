import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    static double w = 1;
    static double z = 1;
    static double x = 1;
    public static class FunctionMy extends Main {
        public static double FunctionMy1(double y){
            return pow(y+2*w,3)/(log(y+0.75));
        }
        public static double FunctionMy2(double y){
            return (asin(acos(x+y+pow(z,2)))-acos(asin(x+y-pow(z,2))))/abs(x+y+z);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        while (n < 10){
            System.out.println("input y");
            double y = in.nextDouble();
            sum += FunctionMy.FunctionMy1(y) + FunctionMy.FunctionMy2(y);
            n++;
        }
        System.out.println(sum);
    }
}
