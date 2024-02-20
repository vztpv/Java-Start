package scanner_ex;

import java.util.Scanner;

public class ScannerEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int price = -1;
            int quantity = 0;
            System.out.print("Price(-1 : exit) : ");
            price = input.nextInt();
            if (price == -1) {
                System.out.println("program ends..");
                break;
            }
            System.out.print("Quantity : ");
            quantity = input.nextInt();

            double cost = price * quantity;
            System.out.println("all cost is " + cost);
        }
    }
}
