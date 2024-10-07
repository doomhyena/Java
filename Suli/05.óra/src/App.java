import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rnd =  new Random();

        double a = rnd.println(100-10+1)+10; //10-100
        double b = rnd.println(100-10+1)+10; //10-100
        double c = rnd.println(100-10+1)+10; //10-100

        if (a + b > c && a + c > b && b + c > a) {
            double ker = a+b+c;
            double s = ker/2;
            double ter =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Kerület: "+ker);
            System.out.println("Terület: "+ter);
        } else {
            System.out.println("Nincs ilyen háromszög nincs!")
        }
        double r = rnd.nextInt(100 - 10 + 1) + 10; // 10-100
        if (r != 0) {
            double ker = 2 * r * Math.PI;
            double ter = r * r * Math.PI;
            System.out.println("Kör Kerület: " + ker);
            System.out.println("Kör Terület: " + ter);
        } else {
            System.out.println("Nincs ilyen kör nincs!");
        }
    }
}
