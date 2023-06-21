public class DeleteDuplicateArray {
    static void deleteDuplicate(int arr[]){
        int[] str = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<str.length;j++){
                if(arr[i]==str[j]){
                    count++;
                }
            }
            if(count == 0){
                for(int k=0;k<str.length;k++){
                    if(str[k]==0){
                        str[k]=arr[i];
                        break;
                    }
                }
            }
        }
        for(int j=0;j<str.length;j++){
            if(str[j]>0){
                System.out.print(str[j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,2,2,1};
        deleteDuplicate(arr);
    }
}
