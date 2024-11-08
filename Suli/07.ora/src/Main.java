import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 *
 *  author: Csontos Kincső 13/A
 *  date: 2022.11.04
 *
 */
public class Main {
    public static void main(String[] args) {
        /*
// ---------------------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int number1 = scanner.nextInt();
        System.out.println("A megadeath szám: " + number1);

        if(number1 % 2 == 0) {
            System.out.println("A szám páros! A szám: " + number1);
        } else System.out.println("A szám páratlan! A szám: " + number1);
// ---------------------------------------------------------------------------------------------------
        int[] tomb = new int[3];
        System.out.println("A tömb nagysága: " + Arrays.toString(tomb));
        tomb[0] = 1;
        tomb[1] = 2;
        tomb[2] = 3;
        System.out.println("A tömb nagysága: " + Arrays.toString(tomb));
        System.out.println("A tömb első elemne: " + tomb[0]);
        System.out.println("A tömb első elemne: " + tomb[tomb.length-1]);
*/
// ---------------------------------------------------------------------------------------------------
        System.out.println("1.feladat: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int number1 = scanner.nextInt();
        System.out.println("A megadeath szám: " + number1);
// ---------------------------------------------------------------------------------------------------
        System.out.println("2.feladat: ");

        Scanner be = new Scanner(System.in);
        System.out.println("Kérlek add meg, hogy mekkora legyen a tömb: ");
        int size = be.nextInt();
        int[] numbers = new int[size];
        System.out.println("A tömb nagysága: " + numbers.length);
// ---------------------------------------------------------------------------------------------------
        System.out.println("3.feladat: ");

        Random rnd = new Random();
        int random = rnd.nextInt(100-10+1)+10;
        int[] tomb = new int[random];
        if (tomb.length > 2) {
            tomb[0] = rnd.nextInt(100-10+1)+10;
            tomb[1] = rnd.nextInt(100-10+1)+10;
        } else {
            System.out.println("A tömb nem elég nagy, mint 2!");
        }
        System.out.println("A tömb első két eleme: " + tomb[0] + " " + tomb[1]);
// ---------------------------------------------------------------------------------------------------
        System.out.println("4.feladat: ");

        if(tomb[1] % 2 == 0) {
            System.out.println("A tömb második eleme páros! A tömb eleme: " + tomb[1]);
        } else {
            System.out.println("A tömb második eleme páratlan! A tömb eleme: " + tomb[1]);
        }
        for (int i = 0; i < tomb.length; i++) {

        }
    }
}
