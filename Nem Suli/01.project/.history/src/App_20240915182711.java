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

         // Real-Life Examples

         // Student data
        String studentName = "Csongor Katona";
        int studentID = 15;
        int studentAge = 19;
        float studentFee = 75.25f;
        char studentGrade = 'A';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
            }
}
