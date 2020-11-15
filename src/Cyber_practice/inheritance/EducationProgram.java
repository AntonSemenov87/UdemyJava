package Cyber_practice.inheritance;

public class EducationProgram {
    public static void main(String[] args) {
        CodingBootcamp cb = new CodingBootcamp();
        cb.name = "Tech School";
        cb.address = "Chicago, IL 60622";
        cb.type = "bootcamp";

        cb.giveHW();
        cb.hostEvent("Jan 1, 2021");
    }
}
