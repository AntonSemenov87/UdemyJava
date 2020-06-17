package Section5;

public class Loops_task {
    public static void main(String[] args) {
       int number = 4;
       int finishNumber = 20;
       int sum = 0;
       int countOfEvenNumbers = 0;

       while (number <= finishNumber) {
           if (isEvenNumber(number)) {
               System.out.println(number + " is an even number");
               sum += number;
               countOfEvenNumbers++;
               if (countOfEvenNumbers == 5) break;
           }
           number++;
       }
        System.out.println("Sum is " + sum);
        System.out.println("Event numbers found: " + countOfEvenNumbers);
    }


    public static boolean isEvenNumber (int number) {
        return (number % 2 == 0);
    }
}
