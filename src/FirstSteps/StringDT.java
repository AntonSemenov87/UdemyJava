package FirstSteps;

public class StringDT {
    public static void main(String[] args) {
        // String is a Class, sequence of characters

       String myString = "This is a String";
       System.out.println("my String is equal to " + myString);
       myString = myString.concat(" - this is addition");
       myString = myString + ", and there is more \n";
       System.out.println(myString);
       String footer = "Ancore Inc";
       footer = footer.concat(" 2020");
       footer = "\u00A9 " + footer + "\n";
        System.out.println(footer);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("\nLast String is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("\nLast String is equal to " + lastString);

        String c = "This is " + "a String";
        System.out.println(c);

    }
}
