public class TowerOfHanoi {

    public static void towerOfHonoi(int n, String src , String dest , String helper){
        if (n==1){
            System.out.println("Transfer Disk " +n+ " from " +src+ " to " +dest);
            return;
        }
        towerOfHonoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk " +n+ " from " +src+ " to " +dest);
        towerOfHonoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHonoi(n,"S","D", "H");
    }
}
