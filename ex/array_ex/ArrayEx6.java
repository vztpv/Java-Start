package array_ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("min : " + min);
        System.out.println(("max : " + max));
    }
}
