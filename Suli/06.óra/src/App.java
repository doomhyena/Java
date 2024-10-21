import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rnd = new  Random();

        double a = rnd.nextInt(100-10+1)+10;

        if (a == 0) {
            System.out.println("Ez nem másodfokú egyenlet");
        } else {
            double b = rnd.nextInt(100-10+1)+10;
            double c = rnd.nextInt(100-10+1)+10;
            double disz = b*b-4*a*c;

            if (disz > 0) {
                double x1 = (-b + Math.sqrt(disz)) / (2 * a);
                double x2 = (-b + Math.sqrt(disz)) / (2 * a);
                System.out.println("x1: " + x1);
                System.out.println("x2 " + x2);
            } else if (disz == 0) {
                double x = -b / (2 * a);
                System.out.println("x: " + x);
            } else {
                System.out.println("Nincs valós megoldás!");
            }
        }

    }
}
