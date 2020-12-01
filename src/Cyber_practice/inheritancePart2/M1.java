package Cyber_practice.inheritancePart2;

public class M1 extends Macbook {
    boolean newVersion;

    public M1 () {
        super();
    }

    public void myM1(){
        this.newVersion = true;
        super.color = "green";
    }

}
