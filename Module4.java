import java.util.*;
import java.io.*;
public class Module4 {
    public static int findLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void printReverseArray(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
    // // Q1. Write a Program to find the largest number in an array
     Scanner scn = new Scanner(System.in);
    // int s1 = scn.nextInt();
    // int[] arr1 = new int[s1];
    // for(int i=0; i<s1; i++){
    //     arr1[i] = scn.nextInt();
    // }
    // System.out.println(findLargest(arr1));

    // // Q2   Write a program to find the smallest number in an array.
    // int s2 = scn.nextInt();
    // int[] arr2 = new int[s2];
    // for(int i=0; i<s2; i++){
    //     arr2[i] = scn.nextInt();
    // }
    // System.out.println(findSmallest(arr2));

    // // Q3 Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above
    // int s3 = scn.nextInt();
    // int[] arr3 = new int[s3];
    // for(int i=0; i<s3; i++){
    //     arr3[i] = scn.nextInt();
    // }
    // int max = findLargest(arr3);
    // int min = findSmallest(arr3);
    // System.out.println(max-min);

    // // Q4 Java Program to print the elements of an array in reverse order
    // int s4 = scn.nextInt();
    // int[] arr4 = new int[s3];
    // for(int i=0; i<s4; i++){
    //     arr4[i] = scn.nextInt();
    // }
    // printReverseArray(arr4);
    // // Q5 Java Program to find the frequency of each element in the array
    // // INPUT
    // // Arr[] = [ 10,20,20,30,25 ] 
    // // OUTPUT	
    // // 10→ 1
    // // 20→ 2
    // // 30→ 1
    // // 25 → 1
    // int s5 = scn.nextInt();
    // int[] arr5 = new int[s3];
    // for(int i=0; i<s5; i++){
    //     arr5[i] = scn.nextInt();
    // }
    // //using hashMap
    // HashMap<Integer,Integer> map = new HashMap<>();
    // for(int i=0; i<s5; i++){
    //     map.put(arr5[i],map.getOrDefault(arr5[i],0)+1);
    // }
    // for(Integer val : map.keySet()){
    //     System.out.print(val+" -> " +map.get(val));
    // }

    // //By Sorting
    // Arrays.sort(arr5);
    // int count = 0;
    // for(int i=0; i<arr5.length; i++){
    //     if(i==0){
    //         count++;
    //     }
    //     else if(arr5[i]==arr5[i-1]){
    //         count++;
    //     }
    //     else{
    //         System.out.print(arr5[i-1]+" -> "+count);
    //         count++;
    //     }
    // }

    // // Q6 Java Program to copy all elements of one array into another array
    // int s6 = scn.nextInt();
    // int[] arr6 = new int[s3];
    // for(int i=0; i<s6; i++){
    //     arr6[i] = scn.nextInt();
    // }
    // int[] dummy = new int[arr6.length];
    // for(int i=0; i<arr6.length; i++){
    //     dummy[i] = arr6[i];
    // }

    // // Q7 Write a Program to find Fibonacci Series upto n   (n>=2)
    // //                 0 1 1 2 3 5 8 13 21  ……….
    // int n = scn.nextInt();
    // int a = 0;
    // int b = 1;
    // int i=0;
    // while(i++<n){
    //     System.out.print(a+" ");
    //     int c = a+b;
    //     a = b;
    //     b = c;
    // }

    // // Q8 Write a Program to find a Fibonacci Number
    // //                         For eg 5th number in Fibonacci series is 5
    // int nth = scn.nextInt();
    // int a1 = 0;
    // int b1 = 1;
    // int i1=0;
    // while(i1++<nth){
    //     int c1 = a1+b1;
    //     a1 = b1;
    //     b1 = c1;
    // }
    // System.out.println(a1);
    // Q9 Print pattern like this-

    // Sample Input
    // 5
    // Sample Output
    // *	*	*	*	*	
    //     *	*	*	*	
    //         *	*	*	
    //             *	*	
    //                 *
    // int row = scn.nextInt();
    // for(int r=0; r<row; r++){
    //     for(int c=0; c<row; c++){
    //         if(c<r){
    //             System.out.print("  ");
    //         }
    //         else{
    //             System.out.print("* ");
    //         }
    //     }
    //     System.out.println();
    // }

    // Q10 Print the pattern like this
    // Sample Input
    // 5
    // Sample Output
    //                 *	
    //             *	*	
    //         *	*	*	
    //     *	*	*	*	
    // *	*	*	*	*	

    int col = scn.nextInt();
    for(int r=0; r<col; r++){
        for(int c=0; c<col; c++){
            if((r+c)<col-1){
                System.out.print("  ");
            }
            else{
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    }
}
