public class SeriesQ6 {
    static void createSeries(int n){
        int first=2,second=1;
        int []arr=new int[n+2];
        arr[0]=first;
        arr[1]=second;
        for(int i=2;i<n+2;i++){
            if(i%2==0){
                arr[i]=arr[i-2]+2;
            }
            else{
                arr[i]=arr[i-2]+2;
            }
        }
        for(int j=0;j<n+2;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int n=10;
        createSeries(n);
    }
}
