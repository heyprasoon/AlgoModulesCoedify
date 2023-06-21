public class MoveZero {
    static void moveZero(int[] arr){
        int point=0,temp=0;
        for(int i=1;i<arr.length;i++){
            if(arr[point]>0 && i>point){
                point++;
            }
            if(arr[i]>0 && i>point && arr[point]==0){
                temp=arr[point];
                arr[point]=arr[i];
                arr[i] = temp;

            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        moveZero(arr);
    }
}
