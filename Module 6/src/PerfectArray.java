public class PerfectArray {

    public static boolean perfectArray(int[] arr){

        int i = 0;
        int j = arr.length-1;

        while(i<j){

            if(arr[i++] != arr[j--])
                return false;

        }

        return true;

    }

    public static void main(String[] args) {

        int arr[] = {10,20,30,30,20,10};

        System.out.println(perfectArray(arr));

    }

}
