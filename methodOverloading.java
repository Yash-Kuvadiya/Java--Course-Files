// compile-time polymorphism :- method overloading is used to achieve compile-time polymorphism

class Calculation { 
    int add(int a, int b, int c){
        return a+b+c;
    } 
    int add(int a, int b) {  
        return a + b;  
    }  
    double add(double a, double b) {  
        return a + b;  
    }  
}
public class methodOverloading {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        System.out.println("Sum of integers: "+calc.add(10, 20, 30));
        System.out.println("Sum of integers: " + calc.add(5, 3));  
        System.out.println("Sum of doubles: " + calc.add(2.5, 3.7));  
    }
}
