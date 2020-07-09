package Section6.Encapsulation.Task;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner (int tonerAmount) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            return this.tonerLevel += tonerAmount;
        } else {
            return -1;
        }
    }

}
