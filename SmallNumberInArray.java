public class SmallNumberInArray {
    static int fact(int n){
        if(n<=1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    static void findSmallest(int arr[]){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=smallest+arr[i];
                arr[i]=smallest-arr[i];
                smallest=smallest-arr[i];
            }
        }
        int factorial = fact(smallest);
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{13,22,11,5,6,12};
        findSmallest(arr);
    }
}
