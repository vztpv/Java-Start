package scanner_ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("input : ");
        x = input.nextInt();
        boolean is_even = (x & 1) == 0;
        System.out.println(x + " is " + (is_even ? "even" : "odd"));
    }
}
