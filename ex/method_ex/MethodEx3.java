package method_ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        System.out.println("balance " + balance);
        balance = withdraw(balance, 20000);
        System.out.println("balance " + balance);
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
