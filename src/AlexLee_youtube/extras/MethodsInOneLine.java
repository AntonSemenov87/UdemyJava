package AlexLee_youtube.extras;

class Student {
    String name;
    int grade;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }
}

public class MethodsInOneLine {
    public static void main(String[] args) {

        String a = "work";
        try {
            System.out.println(a.toUpperCase().charAt(4));
        } catch (IndexOutOfBoundsException e){
            System.out.println("This index is out of bound");
        }

        String b = "pie";
        int c = b.concat(" is good").chars().toArray()[0];
        System.out.println(c);


        Student s = new Student();
        s.setName("Bob").setGrade(12);

        System.out.println(s.name + " " + s.grade);


    }

}
