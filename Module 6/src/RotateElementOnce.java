import java.util.Arrays;

public class RotateElementOnce {

    public static void rotateElementOnce(int[] arr){

        int n = arr.length;

        swap(arr,0,n-1);
        swap(arr,1,n-1);


        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j){

        while(i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        rotateElementOnce(arr);

    }

}
