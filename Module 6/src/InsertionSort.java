import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]){

        int n = arr.length;

        for(int i=1; i<n; i++){

           int val = arr[i];
           int j = i-1;

           while(j>=0 && val < arr[j]){

               arr[j+1] = arr[j];
               j--;

           }

           arr[j+1] = val;

        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {

        int arr[] = {20,40,10,20,90,50};

        insertionSort(arr);

    }

}
