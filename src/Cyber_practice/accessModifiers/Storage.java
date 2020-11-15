package Cyber_practice.accessModifiers;

public class Storage {
    public static void main(String[] args) {

        Chair ikeaChair = new Chair();
        ikeaChair.model = "IKEA";
        ikeaChair.setSize(15);
        ikeaChair.info();
        System.out.println(ikeaChair.getSize());

        System.out.println("------------------*********--------------------");

        Chair homedepotChair = new Chair();
        homedepotChair.setSize(12);
        homedepotChair.model = "Home Depot";
        homedepotChair.info();
        System.out.println(homedepotChair.getSize());


    }
}
