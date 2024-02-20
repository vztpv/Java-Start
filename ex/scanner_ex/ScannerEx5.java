package scanner_ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;
        int temp = 0;

        System.out.println("input integer a, b");
        System.out.print("a : ");
        a = input.nextInt();
        System.out.print("b : ");
        b = input.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("a is " + a + " , b is " + b);
    }

}
