package loop_ex;

public class LoopEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (count < 10) {
            System.out.println(num);
            ++count;
            num += 2;
        }
        System.out.println();
        System.out.println();
        for (count = 0, num = 2; count < 10; ++count, num += 2) {
            System.out.println(num);
        }
    }
}
