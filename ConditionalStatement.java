import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number between 1 to 3");
        int number = sc.nextInt();

        // if(number==1){
        //     System.out.println("It is One");
        // }
        // else if(number==2){
        //     System.out.println("It is Two");
        // }
        // else if(number==3){
        //     System.out.println("It is Three");
        // }
        // else{
        //     System.out.println("Enter valid input");
        // }


        switch (number) {
            case 1:
                System.out.println("It is One");
                break;
            case 2:
                System.out.println("It is Two");
                break;
            case 3:
                System.out.println("It is Three");
                break;
            default:
                System.out.println("Enter Valid Number");
        }
    }
}







// Interview Question Link(ChatGPT) : https://chatgpt.com/share/6774e194-12d8-8006-a63c-0448b45f0480