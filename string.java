public class string {
    public static void main(String[] args) {
        
        // Java String is Immutable . We can't Change it.



        // String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // System.out.println("The length of the txt string is: " + txt.length());

        //indexOf()
        // String txt = "Please locate where 'locate' occurs!";
        // System.out.println(txt.indexOf("locate")); // Outputs 7

        // String firstName = "John";
        // String lastName = "Doe";
        // System.out.println(firstName + " " + lastName);

        //concat()
        // String firstName = "John ";
        // String lastName = "Doe";
        // System.out.println(firstName.concat(lastName));

        // int x = 10;
        // int y = 20;
        // int z = x + y;  // z will be 30 (an integer/number)

        // String x = "10";
        // String y = "20";
        // String z = x + y;  // z will be 1020 (a String)

        // String x = "10";
        // int y = 20;
        // String z = x + y;  // z will be 1020 (a String)

        //charAt()
        // String myStr = "Hello";
        // char result = myStr.charAt(0);
        // System.out.println(result);

        //compareTo()
        // String myStr1 = "Hello";
        // String myStr2 = "Hello";
        // System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal

        //contains()
        // String myStr = "Hello";
        // System.out.println(myStr.contains("Hel"));   // true
        // System.out.println(myStr.contains("e"));     // true
        // System.out.println(myStr.contains("Hi"));    // false

        //contentEquals()
        // String myStr = "Hello";
        // System.out.println(myStr.contentEquals("Hello"));  // true
        // System.out.println(myStr.contentEquals("e"));      // false
        // System.out.println(myStr.contentEquals("Hi"));     // false

        // String myStr = "Hello";
        // byte[] result = myStr.getBytes();
        // System.out.println(result[0]);


        //getChars() : This method is used to copy a subset of characters from a String into a character array (char[]).
        // char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        // System.out.println(myArray);
        // String myStr = "Hello, World!";
        //syntax : void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
          /*   Parameters:
                    srcBegin: The starting index (inclusive) of the substring in the string.
                    srcEnd: The ending index (exclusive) of the substring in the string.
                    dst: The destination character array where the characters will be copied.
                    dstBegin: The starting index in the destination array where copying begins.*/

        // myStr.getChars(7, 12, myArray, 4);
        // System.out.println(myArray);


        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
        System.out.println(myArray[2]);





        // In Web Browser - String Methods in Java (W3School) 

    }
}
