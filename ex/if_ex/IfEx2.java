package if_ex;

public class IfEx2 {
    public static void main(String[] args) {
        int distance = 5;
        String how = "";

        if (distance <= 1) {
            how = "도보";
        } else if (distance <= 10) {
            how = "자전거";
        } else if (distance <= 100) {
            how = "자동차";
        } else {
            how = "비행기";
        }

        System.out.println("출력 " + how + "를 이용하세요");
    }
}
