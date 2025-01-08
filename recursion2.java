public class recursion2 {

    // Que., TOWER OF HONOI
    /*public static void towerOfHonoi(int n, String src , String dest , String helper){
        if (n==1){
            System.out.println("Transfer Disk " +n+ " from " +src+ " to " +dest);
            return;
        }
        towerOfHonoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk " +n+ " from " +src+ " to " +dest);
        towerOfHonoi(n-1, helper, src, dest);
    }*/



    // QUE : find first and last occurance of element in string 

    //static variable declarartion
    /*public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int index, char element){
        if (index==str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar==element) {
            if (first==-1) {
                first=index;
            }
            else{
                last=index;
            }
        }
        findOccurance(str, index+1, element);
    }*/


    //Que., Check array is sorted or not

    /*public static boolean sortedArray(int arr[],int index){
        //base condition
        if (index==arr.length-1) {
            return true;
        }

        if (arr[index]<arr[index+1]) {
            return sortedArray(arr, index+1);
        }
        else{
            return false;
        }
    }*/


    //Que., String = axbcxxd -- move x at last of string 

    /*public static void moveXLast(String str , String newStr , int index , int count ){
        if (index==str.length()) {
            for(int i=0;i<count;i++){
                newStr+="x";
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if (currChar=='x') {
            count++;
            moveXLast(str, newStr, index+1, count);
        }
        else{
            newStr+=currChar;
            moveXLast(str, newStr, index+1, count);
        }
    }*/


    //Que., Find Subsequence of String 

    /*public static void subsequence(String str , String newString, int index){
        // base condition
        if (index==str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        subsequence(str, newString+currChar, index+1);
        subsequence(str, newString, index+1);
    }*/

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};

    public static void printKeypadCombination(String str, int index, String commbinaton) {
        if(index == str.length()) {
            System.out.println(commbinaton);
            return;
        }

        for(int i=0; i<keypad[str.charAt(index)-'0'].length(); i++) {
        char curr = keypad[str.charAt(index)-'0'].charAt(i);
        printKeypadCombination(str, index+1, commbinaton+curr);
        }
    }


    public static void main(String[] args) {

        // int n = 3;
        // towerOfHonoi(n,"S","D", "H");

        //findOccurance("abaacdaefaah", 0, 'a');

        // int arr[] = {1,2,3};
        // boolean sr = sortedArray(arr, 0);
        // System.out.println(sr);

        // String str = "axbcxxd";
        // moveXLast(str, "", 0, 0);

        // String str = "abc";
        // subsequence(str, "", 0);
        String str="23";
        printKeypadCombination(null, 0, "");
    }
}
