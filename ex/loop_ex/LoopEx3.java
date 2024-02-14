package loop_ex;

public class LoopEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int max = 100;
        while (i < max) {
            sum += i + 1;
            ++i;
        }
        System.out.println("max is " + sum);
        System.out.println();
        System.out.println();

        i = 0;
        sum = 0;
        for (; i < max; ++i) {
            sum += i + 1;
        }
        System.out.println("max is " + sum);
    }
}
