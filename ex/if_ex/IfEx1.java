package if_ex;

public class IfEx1 {
    public static void main(String[] args) {
        int score = 95;
        char grade = 'F';

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }

        System.out.println("score : " + score + " grade : " + grade);
    }
}
