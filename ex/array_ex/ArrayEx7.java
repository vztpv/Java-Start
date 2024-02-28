package array_ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] table = new int[4][3];

        for (int i = 0; i < table.length; ++i) {
            System.out.println((i + 1) + "th...");
            System.out.print("kor ");
            table[i][0] = input.nextInt();
            System.out.print("eng ");
            table[i][1] = input.nextInt();
            System.out.print("math ");
            table[i][2] = input.nextInt();
        }

        for (int i = 0; i < table.length; ++i) {
            int total = table[i][0] + table[i][1] + table[i][2];
            double average = (double) total / 3;

            System.out.println((i + 1) + "th total : " + total + " average : " + average);
        }
    }
}

