// runtime polymorphism :- Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

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

public class methodOverriding {
    public static void main(String[] args) {
        Bank b;  
        b=new SBI();  
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
        b=new ICICI();  
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
        b=new AXIS();  
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 
    }
}
