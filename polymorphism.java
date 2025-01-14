

// there are two types of polymorphism 
//      1.compile-time polymorphism :- method overloading is used to achieve compile-time polymorphism
//      2.runtime polymorphism :- Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.




// Method overloading
/*
 * class Calculation {  
    int add(int a, int b) {  
        return a + b;  
    }  
    double add(double a, double b) {  
        return a + b;  
    }  
}
 */




// Method ooverriding 
class Bank{  
    float getRateOfInterest(){
        return 0;
    }  
}  
class SBI extends Bank{  
    float getRateOfInterest(){
        return 8.4f;
    }  
}  
class ICICI extends Bank{  
    float getRateOfInterest(){
        return 7.3f;
    }  
}  
class AXIS extends Bank{  
    float getRateOfInterest(){
        return 9.7f;
    }  
} 

public class polymorphism {
    public static void main(String[] args) {

        //Calculation calc = new Calculation()
        //System.out.println("Sum of integers: " + calc.add(5, 3));  
        //System.out.println("Sum of doubles: " + calc.add(2.5, 3.7));  

        
        Bank b;  
        b=new SBI();  
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
        b=new ICICI();  
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
        b=new AXIS();  
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
    }
}
