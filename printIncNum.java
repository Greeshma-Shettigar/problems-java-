public class printIncNum {
    static void printIncNum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncNum(n-1);
       System.out.println(n);
    }
    public static void main(String[] args) {
        int n=5;
        printIncNum(n);
    }
    
}
