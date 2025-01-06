public class Patterns_1 {
    public static void main(String[] args) {
        // This is Basic Pattern Programs

       /* 
       1)

        *****
        *****
        *****
        *****

        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println(\n); // this Statement is for the new line for i
        } */




        /* 
        2)

        *****
        *   *
        *   *
        *****


        int n=4;
        int m=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); //It will be give sapce to J
                }
            }
            System.out.println(\n); // this Statement is for the new line for i
        }*/




        /* 
        3)

        *
        **
        ***
        ****

        for (int i = 1; i <= 4; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
            */

        
        /* 
        4)

        ****
        ***
        **
        *

            for (int i = 4; i >= 1; i--) { 
                for (int j = 1; j <= i; j++) { 
                    System.out.print("*");
                }
                System.out.println(); 
            }
          */  


        /* 
        5)
            *

           **

          ***

         ****

        int n=4;
        //outer loop
        for(int i=1; i<=n; i++){
            //space loop
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            //innner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    */



    /* 
    6)
    1

    12

    123

    1234

    12345


        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("\n");
        }
        */



    /* 
    7)
    1234

    123

    12

    1

    int n=4;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println("\n");
    }
    */



    /* 
    8)
    1

    23

    456

    78910

    int n=4;
    int number = 1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(number);
            number++;
        }
        System.out.println("\n");
    }
    */


    /* 
    9)
    1

    01
    
    101
    
    0101
    
    10101



    int n=5;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if ((i+j)%2==0){
               System.out.print("1"); 
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println("\n");
    }
    */

    }
}
