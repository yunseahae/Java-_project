import java.util.ArrayList;

// 동물 클래스 생성
class Animal{
    String name;// name 클래스안에 선언된 변수는 객체변수라고한다.
    Boolean cute;

    public void setName(String name){
        this.name = name;
    }

    public void setCute(Boolean cute){
        this.cute = cute;
    }
}

public class Sampleclass {


    // 과일주스 만들기 메서드
    public static String mixer(String fruits){
        System.out.println(fruits + "주스가 나왔습니다.");
        return fruits + "주스";
    }
    public static void main(String[] args){

        String juice = mixer("사과당근");
        System.out.println("내가 만든 주스 : " + juice);

        Animal cat = new Animal();
        Animal dog = new Animal();

        /*dog.name="강아지";
        cat.name="고양이";*/

        dog.setName("강아지");
        cat.setName("고양이");


        System.out.println(cat.name);
        System.out.println(dog.name);

        cat.setCute(true);
        dog.setCute(true);

        System.out.println(cat.cute);
        System.out.println(dog.cute);

    }

}
