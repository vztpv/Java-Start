package scanner_ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Name : ");
        name = input.nextLine();
        System.out.print("age : ");
        age = input.nextInt();

        System.out.println("Name is " + name + " age is " + age);
    }
}
