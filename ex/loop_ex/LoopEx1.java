package loop_ex;

public class LoopEx1 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count + 1);
            count = count + 1;
        }
        System.out.println();
        System.out.println();
        for (count = 0; count < 10; ++count) {
            System.out.println(count + 1);
        }
    }
}
