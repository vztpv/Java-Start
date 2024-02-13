package if_ex;

public class IfEx4 {
    public static void main(String[] args) {
        double rating = 6;
        int select = 0;
        final int movie1 = 0b001; // 인셉션
        final int movie2 = 0b010; // 토이스토리
        final int movie3 = 0b100; // 고질라

        select += rating <= 9 ? 0b001 : 0b000;
        select += rating <= 8 ? 0b010 : 0b000;
        select += rating <= 7 ? 0b100 : 0b000;

        if ((select & movie1) != 0) {
            System.out.println("인셉션 ");
        }
        if ((select & movie2) != 0) {
            System.out.println("토이스토리 ");
        }
        if ((select & movie3) != 0) {
            System.out.println("고질라");
        }
    }
}
