import java.util.Arrays;

public class RotateElements {

    public static void rotateEle(int n, int[] arr, int k){

        k = k%n;

        if(k > 0){

            rotate( 0,  n-1,  arr);
            rotate( 0,  k-1,  arr);
            rotate( k,  n-1,  arr);

        }else{

            k *= -1;
            rotate( 0,  n-1,  arr);
            rotate( n-k,  n-1,  arr);
            rotate( 0,  k,  arr);

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int i, int j, int[] arr){

        while(i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {

        int n = 7;
        int arr[] = {1,2,3,4,5,6,7};
        int k = -3;

        rotateEle( n,  arr , k);
    }
}
