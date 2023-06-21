public class ArraySubSet {

    static void wrostCaseCheckSubSet(int arr1[] , int arr2[]){
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
        }
        if(count==arr1.length){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        int arr1[] = new int[] {1,3,4,5,2};
        int arr2[] = new int[] {2,4,3,1,7,5,15};
        wrostCaseCheckSubSet(arr1,arr2);
    }
}
