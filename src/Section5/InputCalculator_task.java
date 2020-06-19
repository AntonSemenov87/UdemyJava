package Section5;

import java.util.Scanner;

public class InputCalculator_task {

        public static void inputThenPrintSumAndAverage(){
            Scanner input = new Scanner(System.in);

            int count = 0;
            int sum = 0;
            long avg = 0;



            while(true){

                boolean isAnInt = input.hasNextInt();
                if(isAnInt){

                    //System.out.println("Enter number:");
                    int num = input.nextInt();
                    // System.out.println(num);

                    count++;
                    sum += num;
                    avg = (long) Math.ceil((double)sum/count);

                }else{
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                    break;
                }
                input.nextLine();
            }
            input.close();
        }
    }

