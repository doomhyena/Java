public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1.Feladat:");
        System.out.println(Math.pow(5, 3)); // 5^3
        System.out.println("2.Feladat:");
        System.out.println(Math.pow(5, 4+2)); // 5^4+2
        System.out.println("3.Feladat:");
        System.out.println(Math.sqrt(Math.pow(6, 3))); // 6^3 és ez a gyök alatt
        System.out.println("4.Feladat:");
        System.out.println(Math.sqrt(Math.pow(5, 2) + 2));  // 5^2 + 2 és ez a gyök alatt
        System.out.println("5.Feladat:");
        System.out.println((-9 + Math.sqrt(9 * 9 - 4 * 1 * 8)) / (2 * 1) + " , " + (-9 - Math.sqrt(9 * 9 - 4 * 1 * 8)) / (2 * 1));
        /*
         * a = 1
         * b = 9
         * c = 8
         * System.out.println(+ (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a) + " , " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
         */
        System.out.println(); // deklaráció
    }
}
