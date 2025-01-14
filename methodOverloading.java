class Calculation {  
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
        System.out.println("Sum of integers: " + calc.add(5, 3));  
        System.out.println("Sum of doubles: " + calc.add(2.5, 3.7));  
    }
}
