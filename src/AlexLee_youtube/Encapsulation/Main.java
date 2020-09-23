package AlexLee_youtube.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(13);
        s.setName("Anton");

        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
