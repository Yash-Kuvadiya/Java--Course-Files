import java.util.Scanner;

public class arrays2D {
    public static void main(String[] args) {
        

        // Declaration Syntax : type arrrayName[][] = new type[row][column];
        //                      int myArray[][] = new int[3][4];


        /* 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Size:");
        int row = sc.nextInt();
        System.out.println("Enter Column Size:");
        int column = sc.nextInt();

        int myArray[][]=new int[row][column]; // declaration of array

        // input of array
        System.out.println("Enter Array Elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                myArray[i][j]=sc.nextInt();
            } 
        }
        System.out.println("Display Elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println(myArray[i][j]+" ");
            } 
           System.out.println();
        }
        */



        // Search A elemet in array and return index of the that element 


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Size:");
        int row = sc.nextInt();
        System.out.println("Enter Column Size:");
        int column = sc.nextInt();

        int myArray[][]=new int[row][column]; // declaration of array

        // input of array
        System.out.println("Enter Array Elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                myArray[i][j]=sc.nextInt();
            } 
        }

        System.out.println("Enter Search Elements:");
        int x = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if (myArray[i][j]==x) {
                    System.out.println("Index Founded : "+i +j);                    
                }
            } 
        }



    }
}
