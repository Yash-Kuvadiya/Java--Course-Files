/*

#Car is an Object:

    -Not entirely correct. A car is a real-world entity that can be represented in programming as an object of a class.
    -A class is a blueprint or template for creating objects. For example, a Car class can define the structure and behavior common to all cars.

#Brake, Color, Company are Properties or Methods:

    -The color and company are typically attributes or properties of the car (data members).
    -The brake might represent a method (functionality or behavior) the car can perform.

#Combination of Properties and Methods is a Class:

    -Correct. A class combines attributes (properties) and methods (behaviors) that define the characteristics and actions of an object.
    -Example:
    
        class Car {
            String color; // Property
            String company; // Property

            void brake() { // Method
            System.out.println("Car is slowing down.");
            }
        }

#Class is Called Using an Object:

    -Partially correct. You instantiate a class to create an object, and you interact with the class's methods and properties using that object.
    -Example:

        Car myCar = new Car(); // 'myCar' is an object of the Car class
        myCar.color = "Red"; // Setting the property
        myCar.company = "Toyota"; // Setting the property
        myCar.brake(); // Calling the method

#Summary:
    -A class is a blueprint that defines properties and methods.
    -An object is an instance of a class, created to use the properties and methods defined in the class.
    -Properties describe the characteristics of the object, and methods define its behaviors.*/




class myClass{
    String color;   // variable /attribute
    String type;

    public void write(){  //method 
        System.out.println("Color : Black");
    }
    public void print(){
        System.out.println("Type : Cello");
    }
}

public class Class_Objects {
    public static void main(String[] args) {
        myClass obj = new myClass();  //object create 
        obj.write(); // class called
        obj.print();
    } 
}
