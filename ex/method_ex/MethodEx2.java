package method_ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String msg = "Hi World";

        print(3, msg);
        print(5, msg);
        print(7, msg);
    }

    public static void print(int n, String msg) {
        for (int i = 0; i < n; ++i) {
            System.out.println(msg);
        }
    }
}
