class employee{
    private int id;
    private String name;
    

    /*
    -jyare variable private ma declare thaya hoi tyare tene direct accesss object through naa kari shakay. 
    - Tyrae through method ae variable ne access karva pade 6e. je getter & setters 6e.
    -getter is always return something.
    - Getter and setter methods in Java are widely used to access and manipulate the values of class fields.
      Usually, class fields are decorated with a private access specifier. Thus, to access them,
      public access specifiers are used with the getter and setter methods.
    */ 
    
    //for name
    public void setName(String name){    // setter - which is set name here...
        this.name = name;
    }
    public String getName(){    // getter- for the name, which is alsways return value 
        return name;
    }

    //for id
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}

public class gettersSetters {
    public static void main(String[] args) {
        employee e1=new employee();

        //for name
        e1.setName("Yash"); // call setter
        System.out.println(e1.getName()); // print name through getter

        //for id
        e1.setId(10);
        System.out.println(e1.getId());
    }
}





// video reference : https://www.youtube.com/watch?v=25zw-ljLLw0&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=40

