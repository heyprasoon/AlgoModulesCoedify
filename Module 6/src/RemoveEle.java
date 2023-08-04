import java.util.Arrays;

public class RemoveEle {

    public static void removeEle(int[] arr,int removeIndex){

        int n = arr.length;

        for(int i=removeIndex; i<n; i++){

            if(i == n-1)
                arr[i] = 0;
            else
                arr[i] = arr[i+1];
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,4,5,6};

        int removeIndex = 3;

        removeEle(arr,removeIndex);

    }
}