package Cyber_practice.inheritance;

public class Employee {
    String firstName;
    String lastName;

    Employee(String firstName, String lastName) {
        System.out.println("Calling superclass constructor");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected void printDetails(){
        System.out.println("Calling superclass printDetails");
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);

    }
}
