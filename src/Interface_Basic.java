interface Predator{
    // interface를 상속받을 수 있다 이때는 implements를 쓴다.
    String getFood();
}

interface Barkble{
    void bark();
}

class Tiger extends Animal implements Predator, Barkble{
    public String getFood(){
        return "apple";
    }
    public void bark() {
        System.out.println("어흥~~~");
    }
}

class Lion extends Animal implements  Predator, Barkble{
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
