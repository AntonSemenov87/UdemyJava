package AlexLee_youtube.UsageOfClasses;

public class Main {
    public static void main(String[] args) {
        Class1 c = new Class1();
        System.out.println(c.x);
        System.out.println(c.chars);

        Class1 d = new Class1();
        System.out.println(d.x);
        System.out.println(d.chars);

        d.printHi();
        c.printHi();

        Class2 a = new Class2();
        System.out.println(a.y);

        System.out.println(a.isValid("Anton"));
    }
}
