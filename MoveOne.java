public class MoveOne {
    static void moveAllOne(int[] arr){
        System.out.println("before");
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }
        int count=0;
        int[] newarr =new int[arr.length];
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]>1||arr[i]<1){
                newarr[count]=arr[i];
                count++;
            }
        }
        for(int j=count;j<arr.length;j++){
            newarr[j]=1;
        }
        System.out.println("");
        System.out.println("after");
        for(int k=0;k<newarr.length;k++){
            System.out.print(newarr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,5,6,1,-1};
        moveAllOne(arr);
    }
}
