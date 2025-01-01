import java.util.Scanner;

public class InputOutput_Variables {
    public static void main(String[] args) {

        //output
        System.out.println("*\n**\n***"); 

        // variable 
        String name ="Yash";
        int a=10;
        boolean val = true;
        char s ='y';
        System.out.println(name);
        System.out.println(a);
        System.out.println(val);
        System.out.println(s); 


        // Input 
        
       Scanner sc = new Scanner(System.in);
    //    String MyName = sc.next();
    //     next() use karta only one word j Aashe instead of We will use nextLine(), Which will be print the Entire line
    //     nextInt()
    //     nextFloat()
    //     String Myname2 = sc.nextLine();
    //    System.out.println(Myname2);



        //Exersize 

        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1+num2);


        // Enter 5 Value at one time
        // Scanner sc5 =  new Scanner(System.in);
        // System.out.println("Enter 5 Input values:");
        // for(int i =0 ;i<5;i++){
        //     int num = sc5.nextInt();
        //     System.out.println("You Enter : " +num);
        // }

        
        // get input from command line 

        // for(String arg : args){
        //     System.out.println("Argument :"+arg);
        // }



        // Interview Question Link(ChatGPT) : https://chatgpt.com/share/6774e194-12d8-8006-a63c-0448b45f0480

    }
}




