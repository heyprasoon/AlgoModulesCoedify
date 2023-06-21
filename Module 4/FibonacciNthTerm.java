public class FibonacciNthTerm {
    static void nthTerm(int n){
        int arr[]= new int[n+2] ;
        arr[0]=0;
        arr[1]=1;
        int temp1=arr[0];
        int temp2=arr[1];
        for(int i=2;i<arr.length;i++){
            arr[i]=temp1+temp2;
            temp1=temp2;
            temp2=arr[i];
        }
        for(int j=0;j<arr.length;j++){
            if(j==(n-2)){
                System.out.println("nth term "+ arr[j] );
            }
            
            
        }
        
    }
    public static void main(String[] args) {
        int n=5;
        nthTerm(n);
    }
}
