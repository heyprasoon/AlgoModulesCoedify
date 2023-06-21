public class ShiftPrime {
    static boolean isPrime(int n){
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            return false;
        }
        return true;
    }
    static void shift(int[] arr){
        int j=0,temp=0;
        for(int i=1;i<arr.length;i++){
            boolean c=isPrime(arr[j]);
            if(c==false && j<i){
                j++;
            }
            c=isPrime(arr[i]);
            if( c==false && j < i){
                temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        for(int k=0;k<=arr.length-1;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{5,9,7,11,8};
        shift(arr);
    }
}
