package if_ex;

public class IfEx3 {
    public static void main(String[] args) {
        int dollar = 100;
        final int RATE = 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = RATE * dollar;
            System.out.println(won + "입니다.");
        }


    }
}
