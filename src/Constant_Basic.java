// m치고 tab키는 public static void main(String[] args) {} 단축키이다

public class Constant_Basic {
    public static void main(String[] args) {
        final String constant_name;
        String name = "윤서해";

        name = "Yunseahae";
        constant_name = "Yunseahae";

        System.out.println("내 이름 변수 : " + name);
        System.out.println("내 이름 상수(정상수 아님) : " + constant_name);



        /*
        * [Literal - 리터럴이란 무엇인가?]
        * constant_value = 상수이다
        * 3 = 리터럴이다.
        * */
        final int constant_value = 3;

        /**
        * 상수와 리터럴의 공통점은 변하지 않는것이고,
         * 차이점은 상수는 변하지않는 "변수"지만
         * 리터럴은 변하지않는 "값" or "데이터"다.
         *
        * */
    }
}
