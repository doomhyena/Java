import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int a = 5;
        int b = 17;
        int c = a*b;
        Random rnd = new Random();
        int d = rnd.nextInt(100-10+1)+10;

        if (a>b) {
            System.out.println(a + "nagyobb mint" + b);
        } else {
            System.out.println(a + "nem nagyobb mint" + b);
        }
    }
}
