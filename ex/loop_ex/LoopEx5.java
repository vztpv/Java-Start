package loop_ex;

public class LoopEx5 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
