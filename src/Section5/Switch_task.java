package Section5;

public class Switch_task {
    public static void main(String[] args) {
        char letter = 'Z';

        switch (letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("A or B or C or D or E is found");
                break;
            default:
                System.out.println("Not found, your letter was " + letter);
                break;
        }


        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("1st month- Jan");
                break;
            case "june":
                System.out.println("6th month - Jun");
        }
    }
}
