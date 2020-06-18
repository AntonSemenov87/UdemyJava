package Section5;

public class ParseVelueFromString {
    public static void main(String[] args) {
        String numberAsString = "2020";
        System.out.println("numberAsString = " + numberAsString); // printed as String

        // CONVERTION:
        // Integer.parseInt(String)

        int numberAsInt = Integer.parseInt(numberAsString);
        System.out.println("Int number is " + numberAsInt); // as int

        double numberAsDouble = Double.parseDouble(numberAsString);
        System.out.println("Double number is " + numberAsDouble); // aw double

        numberAsString += 1;
        numberAsInt += 1;

        System.out.println("Concatinating String + 1: " + numberAsString);
        System.out.println("Adding 1 to original number: " + numberAsInt);


        String num = "2020a";
        int numInt = Integer.parseInt(num);
        System.out.println("numInt = " + numInt);
    }
}
