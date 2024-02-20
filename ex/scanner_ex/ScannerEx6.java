package scanner_ex;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int temp = 0;

        System.out.print("input num1 : ");
        num1 = input.nextInt();
        System.out.print("input num2 : ");
        num2 = input.nextInt();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; ++i) {
            System.out.print(i);
            if (i < num2) {
                System.out.print(", ");
            }

            if (i == Integer.MAX_VALUE) {
                break;
            }
        }
    }
}
