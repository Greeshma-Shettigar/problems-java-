/*write a function that takes two input n and m and outputs the number of unique pathfrom top left 
corner to the bottom right corner of a n X m grid. constraint u can only move down or right one 
unit at a time  */
class uniquePath{
    static int uniquePath(int n,int m){
        if(n==1 || m==1){
            return 1;
        }
        return uniquePath(n-1,m)+uniquePath(n,m-1);
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(uniquePath(n, m));
    }
}