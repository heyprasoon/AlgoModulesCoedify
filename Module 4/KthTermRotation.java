public class KthTermRotation {
    static void rotate(int arr[],int k){
        k=k%10;
        int a=k,b=arr.length-1;
        for(int i=0 ; i<k && i<a ;i++){
            arr[i] = arr[i]+arr[k-i];
            arr[k-i] = arr[i]-arr[k-i];
            arr[i] = arr[i] - arr[k-i];
            a--;
        }

        int n=arr.length-1;
        for(int i=k+1;i<arr.length && i<b ;i++){
            arr[i]=arr[i]+arr[b];
            arr[b] = arr[i]-arr[b];
            arr[i] = arr[i] - arr[b];
            b--;
        }

        for(int j=0;j<arr.length && j<n ;j++){
            arr[j]=arr[j]+arr[n];
            arr[n]=arr[j]-arr[n];
            arr[j]=arr[j]-arr[n];
            n--;
        }
        for(int l=0;l<arr.length;l++)
        System.out.print(arr[l]+" ");
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,40,50};
        int k=12;
        rotate(arr,k);
    }
}
