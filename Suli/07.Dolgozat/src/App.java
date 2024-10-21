import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        
        // Háromszög

        double a = rnd.nextInt(10+1+1)+1;
        double b = rnd.nextInt(10+1+1)+1;
        double c = rnd.nextInt(10+1+1)+1;
        
        if (a + b > c && a + c > b && b + c > a) {
            double ker = a + b + c;
            double s = ker / 2;
            double ter = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Kerület: " + ker);
            System.out.println("Terület: " + ter);
        } else {
            System.out.println("Nincs ilyen háromszög!");
        }

        // Kör

        double r = rnd.nextInt(10+1+1)+1;
        if (r != 0) {
            double ker = 2 * r * Math.PI;
            double ter = r * r * Math.PI;
            System.out.println("Kör Kerület: " + ker);
            System.out.println("Kör Terület: " + ter);
            } else {
                System.out.println("Nincs ilyen kör!");
            }    
        
        // Négyszög & Téglalap
        
        if (a == b) {
            double ker = 4 * a;
            double ter = a * a;
            System.out.println("Négyzet Kerület: " + ker);
            System.out.println("Négyzet Terület: " + ter);
        } else {
            double ker = 2 * (a + b);
            double ter = a * b;
            System.out.println("Téglalap Kerület: " + ker);
            System.out.println("Téglalap Terület: " + ter);
        }
    
        // Másodfokú egyenlet
        
        if (a == 0) {
            System.out.println("Ez nem másodfokú egyenlet");
        } else {
            double disz = b * b - 4 * a * c; 
            if (disz > 0) {
                double x1 = (-b + Math.sqrt(disz)) / (2 * a);
                double x2 = (-b - Math.sqrt(disz)) / (2 * a);
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            } else if (disz == 0) {
                double x = -b / (2 * a);
                System.out.println("x: " + x);
            } else {
                System.out.println("Nincs valós megoldás!");
            }
        }
    }
}
