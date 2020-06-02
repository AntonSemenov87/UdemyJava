package Section3;

public class OperatorsOperandsExpressions {
    public static void main(String[] args) {

        int myVar = 15 + 12;
        // 12 and 15 are OPERANDS
        // + is an OPERATOR

        // EXPRESSION - formed by combining variables, literals, method returns values and operators.
        // 15 + 12 is an expression

        int result = 1 + 2; // 1 + 2 = 3
        // = is an assignment operator -> assigning result of operation to result
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);



    }
}
