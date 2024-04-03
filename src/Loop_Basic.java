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
    }
}
