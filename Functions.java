import java.util.Scanner;

public class Functions {

    //Note : Functions and  Methods are different , Functions will be directly called into the class when Method will be called in the class through the object
            // so basically functions are called directly and methos are called by the objects .

    // public static void myFunction(String name){
    //     System.out.println("My name is :"+name);
    // } 

    // // add two numbers 
    // public static int addFunction(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }
    public static int factorial(int a){
        int fact=1;
        for(int i=a;i>=1;i--){
            fact = fact *i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // myFunction(name);

        // int add=addFunction(10, 20);
        // System.out.println(add);
        System.out.println(factorial(number));
    }
}


// Interview Question Link(ChatGPT) : https://chatgpt.com/share/6774e194-12d8-8006-a63c-0448b45f0480