import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){

            for(int j=i; j<n; j++){

                if(arr[i]>arr[j])
                    swap(arr,i,j);

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

        int arr[] = {10,1,4,2,4,7,20};

        selectionSort(arr);

    }

}
