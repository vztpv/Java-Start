package array_ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentNumber = 0;
        studentNumber = input.nextInt();
        int[] student = new int[studentNumber];
        int total = 0;
        double average = 0.0;

        for (int i = 0; i < student.length; ++i) {
            student[i] = input.nextInt();
        }

        for (int i = 0; i < student.length; ++i) {
            total += student[i];
        }
        average = (double) total / student.length;

        System.out.println("sum : " + total);
        System.out.println("average : " + average);
    }
}
