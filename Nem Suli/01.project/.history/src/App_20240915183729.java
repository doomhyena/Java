public class App {
    public static void main(String[] args) throws Exception {
        // Kiíratás
        System.out.println("Hello, World!");
        /* 
         *  //Változól
         * int a = 3; // szám típus
         * float b = 3.3f; // szám típus nem tudo sokat
         * double c = 7.88888888; //szám típus, kb. 15 tizedes jegyet tud tárolni
         * byte d = 1;
         * short e = 1;
         *  long f = 1; // szám típus 16 számjegyű számokig képes
         * char g = 'g'; // betű változó
         * String szoveg = "Ez egy string"; // Nem lehet gy betű a változó
         * boolean t = true; // igaz vagy hamis érték
        */



        /*
         *         // Számokkal való műveltek
         * int a = 10;
         * int b = 5;
         * int c = a+b;
         * 
         * System.out.println(a/b);
         * System.out.println(a+b);
         * System.out.println(c);
         * 
         *  int x = 5, y = 6, z = 50;
         * System.out.println(x + y + z);
         * 
         * int xs, ys, zs;
         * xs = ys = zs = 50;
         * System.out.println(x + y + z);
         */

         // Tanulói adatok
        String studentName = "Csongor Katona";
        int studentID = 15;
        int studentAge = 19;
        float studentFee = 75.25f;
        char studentGrade = 'A';

        // Print 
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // Téglalap területének kiszámízása

        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
            }
}
