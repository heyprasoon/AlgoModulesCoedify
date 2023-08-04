import java.util.Arrays;

public class SwapKthEle {

    public static void swapKthEle(int arr[],int k){

        int n = arr.length;

        int temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int arr[] = {10,70,30,40,50,60,20,80};

        int k = 2;

        swapKthEle(arr,k);

    }

}
