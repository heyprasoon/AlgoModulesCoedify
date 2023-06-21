public class MoveNTimes {
    static void rotate(int[]arr,int n){
        int [] narr=new int[n];
        int count=0,scount=0;
        for(int i=0;i<n;i++){
            narr[i]=arr[i];
        }
        for(int j=n;j<arr.length;j++){
            arr[count]=arr[j];
            count++;
        }
        for(int k=count;k<arr.length;k++){
            arr[k]=narr[scount];
            scount++;
        }
        for (int a=0; a<arr.length; a++) {
            System.out.print(arr[a]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int rotate=2;
        rotate(arr,rotate);
    }
}
