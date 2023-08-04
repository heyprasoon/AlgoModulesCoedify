public class KthSmallestEle {

    public static void kthSmallestEle(int k,int[] arr){

        int n = arr.length;

        for(int i=0; i<n; i++){

            for(int j=i; j<n; j++){

                if(arr[i]>arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        System.out.println(arr[k-1]);


    }

    public static void main(String[] args) {

        int arr[] = {27,20,37,30,40,50,60};
        int k = 3;

        kthSmallestEle(k,arr);

    }
}
