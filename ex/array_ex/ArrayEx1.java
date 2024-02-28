package array_ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};
        int total = 0;
        double average = 0.0;

        for (int i = 0; i < student.length; ++i) {
            total += student[i];
        }
        average = (double) total / student.length;

        System.out.println("sum : " + total);
        System.out.println("average : " + average);
    }
}
