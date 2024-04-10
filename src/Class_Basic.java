class car {
    String brand;
    int rider;
    int price;

    public void setCar(String brand, int rider, int price){
        this.brand = brand;
        this.rider = rider;
        this.price = price;
    }
}


public class Class_Basic {

    public static void bungeoppang (String[] taste, int idx){
            System.out.println(taste[idx] + "붕어빵입니다.");
    }

    public static void main(String[] args) {
        String [] taste = {"크림", "팥", "김치"};
        bungeoppang(taste, 1);
        car sjcar = new car();
        sjcar.setCar("아우디",5,20000000);
    }
}

// class 껍데기
// 객체 안에 넣는 값
