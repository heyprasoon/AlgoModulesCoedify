public class IntAppearTwice {
    static boolean checkForAppear(int arr[] , int n){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                count++;
            }
            if(count>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4};
        int n=1;
        System.out.println(checkForAppear(arr, n));
    }
}
