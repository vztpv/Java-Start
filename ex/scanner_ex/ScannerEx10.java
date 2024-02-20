package scanner_ex;

import java.util.Scanner;

public class ScannerEx10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalCost = 0;

        while (true) {
            int option = -1;
            System.out.print("1 : 상품입력, 2: 결제, 3 : 프로그램 종료\n input : ");

            option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                String name = "";
                int price = 0;
                int quantity = 0;

                System.out.print("상품명 : ");
                name = input.nextLine();
                System.out.print("상품가격 : ");
                price = input.nextInt();
                System.out.print("구매수량 : ");
                quantity = input.nextInt();

                int sum = price * quantity;
                System.out.println(
                    "상품명 : " + name + " 가격 : " + price + " 수량 : " + quantity + " 합계 : " + sum);
                totalCost += sum;

                input.nextLine();
            } else if (option == 2) {
                System.out.println("총비용 : " + totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못된 option 입니다.");
            }
        }

    }
}
