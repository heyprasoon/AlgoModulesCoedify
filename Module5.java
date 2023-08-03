import java.util.*;
import java.io.*;
import java.io.Console;

public class Module5 {
    public static void reverseString(String  str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }

    public static void numberOfVowelsAndConst(String str){
        int vowelCount = 0;
        int consonentCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vowelCount++;
                }
                else{
                    consonentCount++;
                }
            }
        }
        System.out.println("vowel - "+vowelCount);
        System.out.println("Consonent - "+consonentCount);
    }

    public static void findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]>secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        System.out.println(secMax);
    }

    public static void findSecondSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                secMin = min;
                min = arr[i];
            }
            else if(arr[i]<secMin && arr[i] != min){
                secMin = arr[i];
            }
        }
        System.out.println(secMin);
    }

    public static void averageOfArray(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum/arr.length);
    }

    public static int Largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int Smallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void avgExceptLargestAndSmallest(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        int max = Largest(arr);
        int min = Smallest(arr);
        sum = max-min;
        int length = arr.length-1;
        System.out.println(sum/length);
    }

    public static void numberOfOddAndEvenInt(int[] arr){
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("even -> "+evenCount);
        System.out.println("odd -> "+oddCount);
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    //  Q1 Write a programs called NumberPatternX that prompts user for the size (a non-negative integer in int); and prints the pattern as shown:
    // Enter the size: 8
    // 1                    
    // 1 2                    
    // 1 2 3                   
    // 1 2 3 4                    
    // 1 2 3 4 5                    
    // 1 2 3 4 5 6                    
    // 1 2 3 4 5 6 7                  
    // 1 2 3 4 5 6 7 8 
    int row = scn.nextInt();
    for(int r=1; r<=row; r++){
        for(int c=1; c<=row; c++){
            if(r>=c){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    // Q2 Write a Program to take an input of a string from user and print it on Console.
    String str = scn.next();
    System.out.println(str);

    // Q3 Write a program to find number of characters in a string
    System.out.println(str.length());

    // Q4 Write a program called ReverseString, which prompts user for a String, and prints the reverse of the String by extracting and processing each character. The output shall look like:
    // Enter a String: abcdef
    // The reverse of the String "abcdef" is "fedcba".
    reverseString(str);

    // Q5 Java Program to count the total number of vowels and consonants in a string
    numberOfVowelsAndConst(str);

    // Q6  Write a Java program to find the second largest element in an array.
	int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    findSecondLargest(arr);

    // Q7  Write a Java program to find the second smallest element in an array.
    findSecondSmallest(arr);

    // Q8 Java Program to find average of an int Array
    averageOfArray(arr);
    // Q9  Write a Java program to compute the average value of an array of integers 
    // except the largest and smallest values.
    avgExceptLargestAndSmallest(arr);

    // Q10 Write a Java program to find the number of even and odd integers in a given array of integers.
    numberOfOddAndEvenInt(arr);

    }
}
