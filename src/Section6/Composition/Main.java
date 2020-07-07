package Section6.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-202", "Acer", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "blue");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();

    }
}
