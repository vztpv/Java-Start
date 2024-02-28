package array_ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
