a)
import static java.lang.Math.*;

public class ufff {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++){
                sum += pow(cos(j) + pow(sin(i),j),2);
            }
        }
        System.out.println(sum);
    }
}

b)
import static java.lang.Math.*;

public class ufff {
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                sum *= pow(j,i + 1);
            }
        }
        System.out.println(sum);
    }
}

c)
import static java.lang.Math.*;

public class ufff {
    public static void main(String[] args) {
        double i, j, k, a = 0, b = 0, c = 1;
        for (i = 1; i <= 8; i++){
            for(j = i; j <= 2 * i - 1; j++){
                for (k = i + j; k <= 2 * (i + j); k++){
                    a += log(2 * j - 3 * (i - 0.5 * k));
                }
                b += a;
                a = 0;
            }
            c *= b;
            b = 0;
        }
        System.out.println(c);
    }
}

