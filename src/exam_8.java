/*
8. 다음의 요구 사항을 충족시키는 Java 프로그램을 작성하세요.

1. Shape 인터페이스를 만드세요. 이 인터페이스는 getArea() 메서드를 가져야 합니다.
        2. Circle 클래스를 작성하세요. 이 클래스는 Shape 인터페이스를 구현해야 합니다. Circle 클래스는 반지름을 인스턴스 변수로 가지며, getArea() 메서드를 구현하여 원의 넓이를 반환해야 합니다.
        3. Rectangle 클래스를 작성하세요. 이 클래스는 Shape 인터페이스를 구현해야 합니다. Rectangle 클래스는 가로와 세로를 인스턴스 변수로 가지며, getArea() 메서드를 구현하여 직사각형의 넓이를 반환해야 합니다.
        4. Main 클래스에서는 Circle 및 Rectangle 객체를 생성하고, 각 객체의 넓이를 출력하세요.
*/
interface Shape{
    double getArea();
}

class Circle2 implements Shape{
    private double radius; // instance 변수 radius - 반지름 선언

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double   getArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double  getArea(){
        return length * width;
    }
}


class Rectangle2 implements Shape{
    private double height;
    private double width;

    public void setHeightandwidth(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double  getArea(){
        return height * width;
    }
}
public class exam_8 {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        Rectangle rectangle = new Rectangle();
        Rectangle2 rectangle2 = new Rectangle2();
        circle2.setRadius(10);
        rectangle.setLength(8);
        rectangle.setWidth(7);
        rectangle2.setHeightandwidth(8,7);
        System.out.println("원의 메서드" + circle2.getArea());
        System.out.println("네모의 메서드" + rectangle.getArea());
        System.out.println("사각형의 메서드" + rectangle2.getArea());
    }
}
