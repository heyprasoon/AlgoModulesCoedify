public class PrintSeries {
    static void getSeries(int num){
        int first = 2;
        int second =5;
        int arr[] = new int[num+2];
        arr[0]=first;
        arr[1]=second;
        for(int i=2;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i-2]+arr[i-2];
            }
            else if(i%2!=0){
                arr[i]=arr[i-2]+2;
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int num=10;
        getSeries(num);
    }
}
