package Section6.Inheritance;

public class House_main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor()); // blue
        System.out.println(anotherHouse.getColor()); // blue

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor()); // red
        System.out.println(anotherHouse.getColor()); // red

        House greenHouse = new House ("green"); // now we have 2 Objects, but 3 references
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); // red
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green
    }
}
