package AccessAndStatic_Basic;

class Singleton{
   private static Singleton one;
   private Singleton(){}


       public static Singleton getInstance() {
           if (one == null) {
               one = new Singleton();
           } else {
               return one;
           }

           return null;
       }

}

public class SingletonBasic {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
