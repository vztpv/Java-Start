package scanner_ex;

import java.util.Scanner;

public class ScannerEx9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int n = 0;
        double average = 0.0;

        while (true) {
            int x = 0;
            System.out.print("input number (-1 : exit) : ");
            x = input.nextInt();
            if (x == -1) {
                System.out.println("program ends...");
                break;
            }
            sum += x;
            ++n;
        }

        average = (double) sum / n;

        System.out.println("sum : " + sum + " average : " + average);
    }
}
