/*Constructor name must be the same as its class name.
A Constructor must have no explicit return type.
A Java constructor cannot be abstract, static, final, and synchronized.*/

class Bike1{
    // default constructor & Non-parametrized Constructor
    /*Bike1(){
        System.out.println("THis is Deafult Constructor");
    }*/

    int id;
    String name;

    //parameterized constructor
    Bike1(int i, String n){
        id=i;
        name=n;
    }
    //method to display values 
    void display(){
        System.out.println("id = "+id+" name = "+name);
    }

    // Here Main Method also comes
}

public class constructor { 
    public static void main(String[] args) {
        //This is for default constructor
        //Bike1 b1 = new Bike1(); // object created 
        // at the time of object create , constructor Bike() also called and print the message 

        //This is for Parameterized Constructor
        Bike1 b1 = new Bike1(10, "YAMAHA");
        Bike1 b2 = new Bike1(20, "TVS");

        b1.display();
        b2.display();
    }
}
