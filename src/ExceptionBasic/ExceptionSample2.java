package ExceptionBasic;

class FoolException extends Exception {
}
public class ExceptionSample2 {


    // RuntimeException = 에러가 날 수도 있고 안날수도 있을때
    // Exception = 보통 예측이 가능할 때

    public void sayNick(String nick) throws FoolException {
            if ("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은" + nick + "입니다.");
    }


    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("바보");
        sample.sayNick("야호");
    }
}
