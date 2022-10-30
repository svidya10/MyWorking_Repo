package Overload_Repls;

class AvgMain {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
    public static final int avgElements(int[] n){
        int a = 0;
        for(int i=0; i<n.length; i++){
            a = (a+n[i]);
        }
        return a/n.length;
    }
}
