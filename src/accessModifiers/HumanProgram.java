package accessModifiers;

public class HumanProgram {
    public static void main(String[] args) {

        Human human = new Human();
        human.setAge(121);
        human.setGender('M');
        human.setName("Anton");
        human.setHeight(172);
        human.setWeight(-1);

        System.out.println(human.getName());
        System.out.println(human.getGender());
        System.out.println(human.getAge());
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
    }
}
