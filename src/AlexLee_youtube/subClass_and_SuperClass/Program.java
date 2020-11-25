package AlexLee_youtube.subClass_and_SuperClass;

public class Program {
    public static void main(String[] args) {

        Shoe s = new Shoe("Clerks", 10);
        System.out.println(s.brand);
        System.out.println(s.size);

        WalkingShoe w = new WalkingShoe(true, "Nike", 10);
        System.out.println(w.goreTex);
        System.out.println(w.brand);
        System.out.println(w.size);

        RunningShoe r = new RunningShoe(1.3, "Adidas", 9);
        System.out.println(r.weight);
        System.out.println(r.brand);
        System.out.println(r.weight);

    }
}
