package method_ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select = -1;

        int balance = 0;

        while (true) {
            System.out.print("1. 입금 2. 출금 3. 잔액 조회 4. 종료");
            select = input.nextInt();
            input.nextLine();

            if (select == 1) {
                //입금
                int money = input.nextInt();
                balance = deposit(balance, money);
                System.out.println("잔액 " + balance);
            } else if (select == 2) {
                //출금
                int money = input.nextInt();
                balance = withdraw(balance, money);
                System.out.println("잔액 " + balance);
            } else if (select == 3) {
                //잔액조회
                System.out.println("잔액 " + balance);
            } else if (select == 4) {
                //종료
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못된 번호입력");
            }
        }

    }

    public static int deposit(int balance, int money) {
        System.out.println(money + " 입금 ");
        return balance + money;
    }

    public static int withdraw(int balance, int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(money + " 출금 ");
        } else {
            System.out.println("잔액부족");
        }
        return balance;
    }
}
