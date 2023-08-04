import java.util.*;
import java.io.*;
public class Module6 {
    public static void swapKthElement(int[] arr, int k){
        int left = k-1;
        int right = arr.length-k;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;  
    }
    
    public static void isPerfect(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left] != arr[right]){
                System.out.println("Not perfect");
                return;
            }
        }
        System.out.println("perfect");
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void rotateArrayByOne(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i++){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        printArray(arr);
    }
    public static void sortArrayInDecendingOrder(int[] arr){
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        printArray(arr);
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void remove(int[] arr, int idx){
        while(idx<arr.length){
            arr[idx] = arr[idx+1];
            idx++;
        }
        int[] res = new int[arr.length-1];
        for(int i=0; i<res.length; i++){
            res[i] = arr[i];
            System.out.print(res[i]+" ");
        }
    }

    public static void removeParticularElement(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                remove(arr,i);
            }
        }
        System.out.println("Target is not present in the array");
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // andQ1 Write a Program to merge two array
    int s1 = scn.nextInt();
    int[] arr1 = new int[s1];
    for(int i=0; i<s1; i++){
        arr1[i] = scn.nextInt();
    }
    Arrays.sort(arr1);
    int s2 = scn.nextInt();
    int[] arr2 = new int[s2];
    for(int i=0; i<s2; i++){
        arr2[i] = scn.nextInt();
    }
    Arrays.sort(arr2);
    int[] res = new int[s1+s2];
    int p1 = 0;
    int p2 = 0;
    int idx = 0;
    while(p1<s1 && p2<s2){
        if(arr1[p1] < arr2[p2]){
            res[idx] = arr1[p1];
            p1++;
            idx++;
        }
        else{
            res[idx] = arr2[p2];
            p2++;
            idx++;
        }
    }
    while(p1<arr1.length){
        res[idx] = arr1[p1];
        p1++;
        idx++;
    }
    while(p2<arr2.length){
        res[idx] = arr2[p2];
        p2++;
        idx++;
    }
    printArray(res);
    // Q2 Write a Program to compare two arrays, return true if they are equal else return false.
    int s3 = scn.nextInt();
    int[] arr3 = new int[s3];
    for(int i=0; i<s3; i++){
        arr3[i] = scn.nextInt();
    }
    int s4 = scn.nextInt();
    int[] arr4 = new int[s2];
    for(int i=0; i<s4; i++){
        arr4[i] = scn.nextInt();
    }
    if(s3 != s4){
        System.out.println("false");
        return;
    }
    for(int i=0; i<s3; i++){
        if(arr3[i] != arr4[i]){
            System.out.println("false");
            return;
        }
    }
    System.out.println("true");

    // Q3 Write a Java Program to remove a particular element from an array.
    int s5 = scn.nextInt();
    int[] arr5 = new int[s5];
    for(int i=0; i<s5; i++){
        arr5[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    removeParticularElement(arr5,target);

    // Q4 Java Program to sort an array in ascending order( Bubble sort, Insertion Sort, Selection Sort ), do all by three methods.
    int s6 = scn.nextInt();
    int[] arr6 = new int[s6];
    for(int i=0; i<s6; i++){
        arr6[i] = scn.nextInt();
    }
    //bubbleSort();
    bubbleSort(arr6);

    //InsertionSort();
    insertionSort(arr6);

    //SelectionSorT();
    selectionSort(arr6);

    // Q5 Java Program to sort an array in descending order
    sortArrayInDecendingOrder(arr6);

    // Q6 Given an array arr[] and a number K where K is smaller than the size of the array, the task is to find the Kth Largest element in the given array. It is given that all array elements are distinct.


    // Q7 Given an array arr[] and a number K where K is smaller than the size of the array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

    // Q8 Given an array, rotate the array by one position in clock- wise direction.
    
    // Example 1:
    // Input:
    // N = 54
    // A[] = {1, 2, 3, 4, 5}
    // Output:
    // 5 1 2 3 4
    //     Solution Video: Module 6 Q8 one position shift.mp4
    rotateArrayByOne(arr6);


    // Q9 Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.
    // Example 1:
    // Input:
    // N = 8, K = 3
    // Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
    // Output: 1 2 6 4 5 3 7 8
    // Explanation: Kth element from beginning is
    // 3 and from end is 6.
    int k = scn.nextInt();
    swapKthElement(arr6,k);

    // Q10 Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if it's reverse array matches the original array. If the array is perfect then print "PERFECT" else print "NOT PERFECT".
    // Example 1:
    // Input : Arr[] = {1, 2, 3, 2, 1}
    // Output : PERFECT
    // Explanation:
    // Here we can see we have [1, 2, 3, 2, 1] 
    // if we reverse it we can find [1, 2, 3, 2, 1]
    // which is the same as before.
    // So, the answer is PERFECT
    isPerfect(arr6);


    // Solution Video: Module 6 q10 Perfect.mp4

    }
}
