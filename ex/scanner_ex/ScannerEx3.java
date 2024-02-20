package scanner_ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String foodName = "";
        double foodPrice = 0.0;
        int foodQuantity = 0;

        System.out.print("foodName : ");
        foodName = input.nextLine();
        System.out.print("foodPrice : ");
        foodPrice = input.nextDouble();
        System.out.print("foodQuantity : ");
        foodQuantity = input.nextInt();

        double totalPrice = foodPrice * foodQuantity;
        System.out.println(
            foodQuantity + " " + foodName + " is ordered. total price is " + totalPrice);
    }
}
