
// FUnction calles itself is called as recursion
// recursion ni value memory ma stack na form ma store thaai 6e
public class recursion1 {

    /* 
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1); // recursion - 1 to 5 store in the form of Stack in memory
    }*/

    // print sum of first n natural number 
    /*public static void printSum(int i,int n, int sum){
        //base condition
        if (i==n) {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printSum(i+1, n, sum);
    }*/

    // Print factorial using recursion
    /* public static int printFact(int n){
        //base condition 
        if(n==1){
            return 1;
        }
        int fact_nm1 = printFact(n-1); // recursion
        int fact = n*fact_nm1;
        return fact;
    }*/

    // fibonacci series 
    /*public static void printFib(int a,int b,int n){
        //base condition
        if (n==0) {
            return;
        }

        int c=a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }*/

    


    public static void main(String[] args) {
        
        //printNum(5);

        //printSum(1, 5, 0);

        /*int factorial = printFact(5);
        System.out.println(factorial);*/

        /* Fibonacci
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, 7);
        */

        
    }
}
