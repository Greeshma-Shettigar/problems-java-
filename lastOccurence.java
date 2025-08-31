public class lastOccurence {
    static int lastOccurence(int arr[],int key,int i){
        if(i==0){
            if(arr[i]==key){
                return i;
            }
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,1};
        int key=1;
        System.out.println(lastOccurence(arr,key,arr.length-1));
    }
    
}
