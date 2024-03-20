public class Operator_Basic {

    public static void main(String[] args) {
        int test1 = 0;
        int test2 = 0;
        int test3 = 0;
        int test4 = 0;

        // 내가 무언가를 변수와 함께 프린트를하고 싶다 printf와 %d(정수)를 기술하면된다.

        // 연산식 : ++ 피연산자
//        ++test1;
        System.out.printf("TEST 1 : %d \n", ++test1);
        // 연산식 : -- 피연산자
//        --test2;
        System.out.printf("TEST 2 : %d \n", --test2);
        // 연산식 : ++ 피연산자
//        test3++;
        System.out.printf("TEST 3 : %d \n", test3++);
        System.out.printf("TEST 3 : after %d \n", test3);
        // 연산식 : -- 피연산자
//        test4--;
        System.out.printf("TEST 4 : %d \n", test4--);
        System.out.printf("TEST 4 : after %d \n", test4);

        /*******************************************************/
        
        // 논리 부정 연산자
        System.out.println(!false);
        System.out.println(!true);

        // 산술 연산자
        System.out.println(33/6); // "/" = 항상 몫을 출력함
        System.out.println(33%6); // "%" = 항상 나머지를 출력함

        // (X) % 2 == 0 이면 해당 값은 짝수 아니라면 홀수

        // 비교 연산자
        System.out.println(1>2); // false
        System.out.println(1>=2); // false
        System.out.println(1<2);  // true
        System.out.println(1<=2);  // true
        System.out.println(1 == 2);  // false
        System.out.println(1 != 2);  // true
        System.out.println(!(1 == 2));  // trueL

        // 논리연산자
        System.out.println(true && false);  // AND = 둘 다 true면 true, 나머지는 다 false
        System.out.println(true || false);  // OR = 둘 중 하나만 true면 true, 둘 다 false면 false

        // 2진수 계산법
        System.out.println(10&3);
        System.out.println(10|3);
        System.out.println(10^3);

        // 삼항 연산자
        System.out.println(false ? 1 : 2 );
        System.out.println(true ? 1 : 2 );

        int test = 0;
        System.out.println(test++ != --test && false ^ true || test++ > --test);
    }
}
