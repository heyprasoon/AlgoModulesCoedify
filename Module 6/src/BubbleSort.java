import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[]){

        int n = arr.length;

        for(int i=0; i<n; i++){

            for(int j=0; j<n-1; j++){

                if(arr[j] > arr[j+1])
                   swap(arr,j,j+1);
            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {

        int arr[] = {10,2,4,1,2,30};

        bubbleSort(arr);

    }

}
