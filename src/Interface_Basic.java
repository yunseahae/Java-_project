abstract class Predator extends Animal {
    // interface를 상속받을 수 있다 이때는 implements를 쓴다.
    abstract String getFood();

    void printFood(){ // default 를 제거한다 인터페이스에서 추상화 클래스로 변경했기 때문에 defalut는 더 이상 사용할 수 없습니다.
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkble{
    void bark();
}

class Tiger extends Predator implements Barkble{
    public String getFood(){
        return "apple";
    }
    public void bark() {
        System.out.println("어흥~~~");
    }
}

class Lion extends Predator implements Barkble{
    public String getFood(){
        return "banana";
    }
    
    public void bark() {
        System.out.println("크와아앙");
    }


    // alt + enter를 쓰면 에러를 고칠 수 있다.
}

class Zookeeper{
    void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }
        }

 class Bouncer{
    void barkAnimal(Barkble barkble){
        barkble.bark();
    }
 }

public class Interface_Basic {
    public static void main(String[] args) {
       // Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        //  zookeeper.feed(tiger);
        // zookeeper.feed(lion);
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

        Tiger predatorTiger = new Tiger();
        predatorTiger.bark();
        predatorTiger.getFood();

    }
}
