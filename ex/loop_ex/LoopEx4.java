package loop_ex;

public class LoopEx4 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                System.out.println((i + 1) + " * " + (j + 1) + " = " + ((i + 1) * (j + 1)));
            }
        }
    }
}
