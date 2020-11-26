package AlexLee_youtube.extras;

public class Account {
    String name;
    int age;


    public static void main(String[] args) {
        Account a = new Account();
       a.setName("Pablo");
       a.setAge(34);
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printDetails () {
        System.out.println(getName() + ", " + getAge());
    }

}
