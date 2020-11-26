package AlexLee_youtube;

class Bird {
        public void sing(){
            System.out.println("Bird is singing");
        }
}

class Eagle extends Bird{

}

public class MyObject {
    public static void main(String[] args) {

        MyObject o = new MyObject();
        System.out.println(o instanceof MyObject);
        // class, subclass or interface

        Eagle e = new Eagle();
        e.sing();
        System.out.println(e instanceof Bird);
        System.out.println(e instanceof Eagle);

        e = null;
        System.out.println(e instanceof Bird);

    }
}
