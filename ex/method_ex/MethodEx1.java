package method_ex;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int x = 15, y = 25, z = 35;

        printAverage(a, b, c);
        printAverage(x, y, z);
    }

    public static void printAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = (double) sum / 3.0;
        System.out.println("average : " + average);
    }
}
