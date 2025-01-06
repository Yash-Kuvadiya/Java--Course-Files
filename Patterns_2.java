public class Patterns_2 {
    public static void main(String[] args) {
        //This is advanced pattern questions 


        /* 
        10)

        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *


        int n=4;
        //upper part
        for(int i=1; i<=n;i++){
            //using this j loop we are printed left side of upper part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space loop
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
                // using this j loop we are printed right side of upper part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //lower part
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space loop
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        */



        /* 
        11)

               *****
              *****
             *****
            *****
           *****

        int n=5;
        for(int i=1;i<=n;i++){
            //space 
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //loop for star print
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /* 
        12)

            1 
           2 2 
          3 3 3 
         4 4 4 4 
        5 5 5 5 5 


        int n=5;
        for(int i=1;i<=n;i++){
            //loop for space 
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //print star
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        */



        /* 
        13) palindrome pyramid

            1
           212
          32123
         4321234
        543212345


        int n=5;
        for(int i=1;i<=n;i++){
            //loop for space 
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //print numbers for first half of triangle
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //print number for second half of triangle
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
         */



        /* 
        14)
              
             **
            ****
           ******
          ********
         **********
         **********
          ********
           ******
            ****
             **


         int n=5;
         for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
         for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
         */


        
        // HomeWork




        /* 
         int n=4;
        //upper part
        for(int i=1; i<=n;i++){
            //using this j loop we are printed left side of upper part
            for(int j=1;j<=i;j++){
                if(j==i || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            //space loop
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
                // using this j loop we are printed right side of upper part
            for(int j=1;j<=i;j++){
                if(j==i || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower part
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==i || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //space loop
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==i || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */





        /* 
        int n=5;
        for(int i=1;i<=n;i++){
            //space 
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //loop for star print
            for(int j=1;j<=5;j++){
                if (j==1 || i==1|| i==n || j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        */




        //pascal's triangle
        /* 
        int n = 5; // Number of rows for Pascal's Triangle

        for (int i = 0; i < n; i++) {
            // Print leading spaces to center the triangle
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }

            int value = 1; // Initialize the first value in each row

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1); // Update the value for the next element
            }

            System.out.println(); // Move to the next row
        }
        */


        // Singal diagonal 
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }

    }
}
