import java.util.ArrayList;

public class Conditional_Statement_Basic {
    public static void main(String[] args) {
        boolean money = true;  // 현재 내 상태

        if (money == true) {
            System.out.print("택시를 탄다");
        } else {
            System.out.print("걸어간다");
        }

        int money2 = 3000;
        boolean hasCard = true;

        if (money2 >= 2800 || hasCard == true) {
            System.out.print("택시를 탄다");
        } else {
            System.out.print("걸어간다");
        }

        // 반드시 else를 써야하는것은 아니다.
        if (money2 == 2000) {
            System.out.print("돈이 이천원이 있다");
        }

        // 가변길이// 크기를 마음대로 조절할 수 있다
        // 문자가 들어갈 수 있는 pocket이라는 방이 생성
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("돈");
        pocket.add("담배");
        pocket.add("라이터");

        // contains 포함
        // & = 엠퍼센트
        if (pocket.contains("담배") && pocket.contains("라이터")) {
            System.out.println("버리고 금연한다.");
        } else if (pocket.contains("돈")) {
            System.out.println("난 돈이 있어.");
        }else{
            System.out.println("편의점에서 새로산다.");
        }


//        [0] = 1 X

        int myAge = 25;

        switch (myAge){
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("20대 초반");
            case 25:
                System.out.println("20대 중반");
                break;
            case 26:
                System.out.println("20대 후반");
            case 27:
                System.out.println("20대 후반");
            case 28:
                System.out.println("20대 후반");
            case 29:
                System.out.println("20대 후반");
            default:
                System.out.println("20대가 아닌 다른 나이");
        }









    }

}
