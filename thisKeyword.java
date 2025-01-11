// refere this : https://www.youtube.com/watch?v=W7f2vYcVhg0&t=472s


class test{
    int i; // instance variable
     void setValue(int i){  // if i use X insted of i then output is 10,this is common/simple
                            // but if i change it to i, then output is 0(without using this)
        //i=x;
        this.i=i;

        // this keyword refer instance variable
     }
     void getvalue(){
        System.out.println(i);
     }

}

public class thisKeyword {
    public static void main(String[] args) {
        test t1=new test();
        t1.setValue(10);
        t1.getvalue();
    }
}
