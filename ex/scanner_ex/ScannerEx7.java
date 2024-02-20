package scanner_ex;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.print("Name : ");
            name = input.nextLine();
            if (name.equals("종료")) {
                System.out.println("exited");
                break;
            }
            System.out.print("age : ");
            age = input.nextInt();

            input.nextLine(); // remove enter key.

            System.out.println("Name is " + name + " age is " + age);
        }
    }
}
