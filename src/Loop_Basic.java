public class Loop_Basic {
    public static void main(String[] args){
        // While 반복문
        // 조건문이 true일 동안 반복합니다
        int treeHit = 0;/*
        while (treeHit < 10){
            treeHit ++; // 조건을 주지 않았을 경우 무한루프를 탄다.
            // treeHit = 9라고 가정했을때*/
        while (true){
            treeHit ++;
            if(treeHit % 10 != 0){
                continue; // 계속해라라는 의미 // 위로 다시 돌어간다
            }
            System.out.println("나무를" + treeHit +"번 찍었습니다.");
            if(treeHit == 10){
                System.out.println("나무가 넘어갑니다.");
                break; // 조건문 안에
            }
        }

        // for 문
        String[] dlist = {"one", "two", "three", "four", "five"};

        // 하나씩 출력하기에는 비효율적입니다.
        System.out.println(dlist[0]);
        System.out.println(dlist[1]);
        System.out.println(dlist[2]);
        System.out.println(dlist[3]);
        System.out.println(dlist[4]);
        // 그렇다면 for문을 통해 출력을 하면 됩니다.
        // length 배열의 길이 반환하다
        for (int i = 0; i < dlist.length; i++){ // int i = 0; 초기값 설정 , i < dlist.length;조건 설정 , i ++ 증감 설정
            // 처음에 i = 0이 들어감 ->
            System.out.println(dlist[i]);
            // 출력
        }

        int[] marks = {90, 25, 67, 45, 80};
        for(int i=0; i<marks.length; i++){
            if (marks[i] >= 60){
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }

        // 2중 for문을 한 번 해볼게요.
        // for문을 두 번 사용해서
        // 구구단 2단 ~ 9단까지 출력하는 코드를 작성 해봅시다.

        for(int i=2; i<=9; i++){
            System.out.println("===="+i+"단====");
            for(int j=1; j<=9; j++){
                System.out.println(i+"*"+j+" = "+(i*j));
            }
        }

        // 색깔 배열 선언

        String[] colors = {"red", "green", "yellow"};
        System.out.println(colors);

        for (int a=0; a<colors.length; a++){
            System.out.println(colors[a]);
        }

        // index를 넣는것조차 귀찮아서 자동으로 배열의 값을 가져오는 반복문을 만들어버림
        // for ~ each문이라고합니다.

        for (String color : colors){
            System.out.println(color);
        }

        // for (type ~ 배열안에 들어가 있는 데이터 타입 + 변수명 : iterate ~ 반복해서 값에 접근할 배열
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        // for each로 출력을 해보세요

        for (int number : numbers){
            System.out.println(number);
        }



    }
}
