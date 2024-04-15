

class Cat extends Animal {
    void speak(){
        System.out.println(this.name+" 냐아아옹~ 워어오옹~");
    }
}

class Siamese extends Cat{
    void speak(){
        System.out.println(this.name+"왈왈왈왈");
    }
    void speak(int jjik){
        System.out.println(this.name+ "왈왈왈왈" + jjik + "찍찍찍" ); // 오버라이딩은 이미 있는 메서드를 상속 받아서 만든거 // 오버로딩 없는 메서드를 새로 만드는것
    }
}

public class Method_Overiding_Basic {
    public static void main(String[] args) {
        Siamese siameseCat = new Siamese();
        Cat cat = new Cat();
        cat.setName("바둑이");
        siameseCat.setName("나비");
        siameseCat.speak();
        cat.speak();


        siameseCat.speak(2);
    }
}
