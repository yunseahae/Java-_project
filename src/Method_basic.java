public class Method_basic {
    // 객체 변수 a선언
    int a;

    // 두 숫자를 입력 받아서 평균을 구해주는 메서드
   /* public static int avg(int a, int b){
        int avgValue = (a+b) / 2;
        return avgValue;
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }*/

   /* static void sayNick(String nick){
        if("바보".equals(nick)){
            return;
        }
        System.out.println("나의 별명은" + nick + "입니다");
    }*/

    static void varTest(Method_basic methodBasic){
        methodBasic.a++;
    }


    public static void main(String[] args) {

       // int a = 1;
        // a = varTest(a);
       // System.out.println(a);


       /* sayNick("바보");

            int test1 = avg(100, 90);
            System.out.println(test1);
            System.out.println(avg(80, 90));

            int test2 = sum(200, 300);
            System.out.println(test2);*/
             // 객체 만들기
            Method_basic methodBasic = new Method_basic();
            methodBasic.a = 1;
            methodBasic.varTest(methodBasic);
        System.out.println(methodBasic.a);


    }
    }
