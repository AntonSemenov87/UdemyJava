package AlexLee_youtube.finalKeyword;

final public class Final {

    final int MAX = 5;

    final public void sayHi(){
        System.out.println("Hiii");
    }


    public static void main(String[] args) {
        Final f = new Final();
        System.out.println(f.MAX);
        f.sayHi();


    }


}

//class OtherClass extends Final { // cannot change final class -> cannot inherit from it
//
//}
