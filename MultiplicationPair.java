public class MultiplicationPair {
    static void checkPair(int[] arr,int n){
        int f=0,s=0;
        for(int i=0;i<arr.length;i++){
            f=arr[i];
            for(int j=0;j<arr.length;j++){
                s=arr[j];
                if(f*s==n){
                    break;
                }
            }
            if(f*s==n){
                break;
            }
        }
        System.out.println(f+" "+s);
    }
    public static void main(String[] args) {
        int[] arr= new int[]{1,4,5,7,10};
        int n=20;
        checkPair(arr, n);
    }
}
