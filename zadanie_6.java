import static java.lang.Math.*;
import java.util.Scanner;

public class ufff {
    public static class Oblast{
        public static boolean CalculateHIt(double x, double y) {
            if (y<sqrt(36-x*x) & y >= 0)
                return (!(y < 3 * x + 12 & y < -0.75 * x + 0.75)) && (!(y < x - 1 & x < 4)) &&
                        ((!(1 > pow(x + 2, 2) + pow(y - 4, 2)))) && (!(4 > pow(x - 1, 2) + pow(y - 3, 2)
                        & 1 < pow(y - 2, 2) + pow(x - 1, 2)));
            else return false;
        }
    }
    public static boolean getAns(){
        System.out.println("check dots? 1 - yes , else - no");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        return ans == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ans = getAns();
        while (ans){
            System.out.println("input x and y");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            System.out.println(Oblast.CalculateHIt(x,y));
            ans = getAns();
        }
    }
}
