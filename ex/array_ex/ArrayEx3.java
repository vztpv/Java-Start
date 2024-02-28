package array_ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = input.nextInt();
        }

        for (int i = arr.length; i > 0; --i) {
            System.out.print(arr[i - 1]);
            if (i > 1) {
                System.out.print(", ");
            }
        }
    }
}
