import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rnd =  new Random();
        // Háromszög
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
        // Kör
        double r = rnd.nextInt(100 - 10 + 1) + 10; // 10-100
        if (r != 0) {
            double ker = 2 * r * Math.PI;
            double ter = r * r * Math.PI;
            System.out.println("Kör Kerület: " + ker);
            System.out.println("Kör Terület: " + ter);
        } else {
            System.out.println("Nincs ilyen kör nincs!");
        }
        // Négyszög & Téglalap
        double a1 = rnd.nextInt(100 - 10 + 1) + 10; // 10-100
        double b1 = rnd.nextInt(100 - 10 + 1) + 10; // 10-100

        if (a1 == b1) {
        double ker = 4 * a1;
        double ter = a1 * a1;
        System.out.println("Négyzet Kerület: " + ker);
        System.out.println("Négyzet Terület: " + ter);
        } else {
        double ker = 2 * (a1 + b1);
        double ter = a1 * b1;
        System.out.println("Téglalap Kerület: " + ker);
        System.out.println("Téglalap Terület: " + ter);
        }
    }
}
