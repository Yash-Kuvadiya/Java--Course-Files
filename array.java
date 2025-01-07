import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        // Java array called as the "zero-indexed array" because in java index of array is starting from 0.

        /* 
        // this is the static array
       // int myArray[] = {10,20,30};
        int myArray[] = new int[3];
        myArray[0]=10;
        myArray[1]=20;
        myArray[2]=30;
       // System.out.println(myArray);  // Output : [I@4517d9a3 -- Garbage Value

        // System.out.println(myArray[0]);
        // System.out.println(myArray[1]);
        // System.out.println(myArray[2]);

        for(int i=0;i<=3;i++){
            System.out.println("Printed Array : "+myArray[i]);
        }
        */

        //Dynamic Array
        Scanner sc=new Scanner(System.in);
        System.out.print("Define Size of Array :");
        int size = sc.nextInt();

        int myArray[] = new int[size]; // array declaration

        // Insertion of array
        System.out.println("Enter the values in array :");
        for(int i=0;i<size;i++){
            myArray[i] = sc.nextInt();
        }

        //display array
        System.out.println("Your Array is:");
        for(int i=0;i<size;i++){
            System.out.println(myArray[i]);
        }





    }
}
