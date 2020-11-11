package Cyber_practice.StaticMembers;

public class BestBuy {

    String location;
    static int numOfComputers;

    static {
        System.out.println("static block always runs first");
        numOfComputers = 50;
    }

    public static void printComputer(){
        System.out.println(numOfComputers);
    }

}
