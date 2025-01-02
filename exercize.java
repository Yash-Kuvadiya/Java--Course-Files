import java.util.Scanner;

public class exercize {

    //Write a function to print the sum of all odd numbers from 1 to n.
   /*  public static void oddFun(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }*/



    /*Write a program to enter the numbers till the user wants and at the end it should display 
    the count of positive, negative and zeros entered.*/
    /*  public static void checkNumbers() {
        int zeroCount = 0, positiveCount = 0, negativeCount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (type 'q' to stop):");

        while (true) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num == 0) {
                    zeroCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    positiveCount++;
                }
            } else if (sc.hasNext() && sc.next().equalsIgnoreCase("q")) {
                break; 
            } else {
                System.out.println("Invalid input. Enter a number or 'q' to quit.");
            }
        }
        System.out.println("Count of Positive Numbers: " + positiveCount);
        System.out.println("Count of Negative Numbers: " + negativeCount);
        System.out.println("Count of Zeros: " + zeroCount);
    }   */

    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    /*public static void powerFun(int x,int n){
        int power = 0;
        for(int i=0;i<=n;i++){
            power = power*x;
        }
        System.out.println(power);
    }*/


    public static void main(String[] args) {
         //oddFun(10);  
         //checkNumbers();
        //powerFun(2, 3);


    }
}
