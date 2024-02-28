package array_ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.print("1. 등록 2. 목록 3.종료");
            int select = scanner.nextInt();
            scanner.nextLine();

            if (select == 1) {
                if (productCount >= 10) {
                    System.out.println("리스트가 꽉 찼습니다.");
                    continue;
                }
                productNames[productCount] = scanner.nextLine();
                productPrices[productCount] = scanner.nextInt();
                productCount++;
            } else if (select == 2) {
                System.out.println("name price");
                for (int i = 0; i < productCount; ++i) {
                    System.out.println(productNames[i] + " " + productPrices[i] + " ");
                }
            } else if (select == 3) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택번호");
            }
        }
    }
}
