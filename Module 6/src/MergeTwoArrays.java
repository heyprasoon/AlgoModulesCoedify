import java.util.Arrays;

public class MergeTwoArrays {

    public static void mergeTwoArray(int arr1[],int arr2[]){

        int i =0;
        int j =0;
        int k = 0;

        int arr[] = new int[arr1.length+arr2.length];

        while(j<arr2.length && i<arr1.length){

            if(arr1[i]<arr2[j])
                arr[k++] = arr1[i++];
            else
                arr[k++] = arr2[j++];

        }

        while(i<arr1.length)
            arr[k++] = arr1[i++];


        while(j<arr2.length)
            arr[k++] = arr2[j++];


        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {

        int arr1[] = {10,20,40,60,80};
        int arr2[] = {30,50,70,90,100};

        mergeTwoArray(arr1,arr2);


    }

}
