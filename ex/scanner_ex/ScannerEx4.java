package scanner_ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;

        System.out.print("단 입력 : ");
        x = input.nextInt();

        for (int i = 0; i < 9; ++i) {
            System.out.println(x + " * " + (i + 1) + " = " + (x * (i + 1)));
        }
    }
}
