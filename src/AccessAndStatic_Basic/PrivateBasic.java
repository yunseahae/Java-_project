package AccessAndStatic_Basic;

public class PrivateBasic {
    //  private는 해당 클래스 내부에서만 접근이 가능
    private String secret;
    private String getSecret(){
        return this.secret;
    }
}
