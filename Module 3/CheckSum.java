public class CheckSum {
    static void checkSum(int arr[],int sum){
        int i=0;
        int j=arr.length-1;
        while(i!=j){
            if(arr[i]+arr[j]>sum){
                j--;
            }
            else if(arr[i]+arr[j]<sum){
                i++;
            }
            else if(arr[i]+arr[j]==sum){
                System.out.println(i +" and "+ j);
                break;
            }
        }

    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{2,7,11,15};
        int sum=9;
        checkSum(arr,sum);
    }
}
