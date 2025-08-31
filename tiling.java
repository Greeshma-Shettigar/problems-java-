/* Given a 2 X n board and tile size is 2 X 1 , count the no of ways to tile the baord using 2 X 1 tile */
public class tiling {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tiling(n-1);
        //horizontal choice
        int fnm2=tiling(n-2);
        int totalWays=fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(tiling(n));
    }
}
