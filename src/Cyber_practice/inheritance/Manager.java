package Cyber_practice.inheritance;

public class Manager extends Employee{

    long bonus;

    public Manager (String firstName, String lastName, long bonus) {
        super(firstName, lastName);
        this.bonus = bonus;
    }

    protected void printDetails(){
        super.printDetails();
        System.out.println("Bonus in USD: " + this.bonus);
        System.out.println("You shall call me Mr." + super.firstName + " " + super.lastName);
    }

}
