class Animal {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep(){
        System.out.println(this.name+"zzz");
    }
}

public class Inheritance_Basic {
    public static void main(String[] args){
        // Animal dog = new Dog(); == 가능하지만 Dog Class의 메서드는 사용할 수 없습니다. == Dog is a Animal
       // Dog dog = new Animal(); == X 불가능 Animal is a Dog
        Dog dog = new Dog();
        dog.setName("왈왈이");
        System.out.println(dog.name);
        dog.sleep();
    }
}
