import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        int i = 60;
        System.out.println(i);
        i = 50;
        System.out.println(i);


        // tömb létrehozása
        int[] numbers = new int[10];

        // tömb  elemeinek beállítása

        numbers[0] = 4;
        numbers[1] = 12;
        numbers[2] = 7;
        numbers[3] = -6;
        numbers[4] = 53;
        numbers[5] = 42;
        numbers[6] = 31;
        numbers[7] = 0;
        numbers[8] = -100;
        numbers[9] = 72;

        // tömb elemeinek kiíratása
        /*
         * System.out.println(numbers[0]);
         * System.out.println(numbers[1]);
         * System.out.println(numbers[2]);
         * System.out.println(numbers[3]);
         * System.out.println(numbers[4]);
         * System.out.println(numbers[5]);
         * System.out.println(numbers[6]);
         * System.out.println(numbers[7]);
         * System.out.println(numbers[8]);
         * System.out.println(numbers[9]);
         */
        System.out.println(Arrays.toString(numbers));

        // Több dimenziós tömbök
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        System.out.println(matrix[0][0]);
    }
}