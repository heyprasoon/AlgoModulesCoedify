import java.util.*;
public class Module7 {
    public static void compression(String str){
        //Approach 1
        StringBuilder res = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(res.toString().indexOf(str.charAt(i))==-1){
                res.append(str.charAt(i));
            }
        }
        System.out.println(res.toString());

        //Approach 2
        int idx = 0;
        StringBuilder res2 = new StringBuilder();
        while(idx<str.length()){
            if(idx==0){
                res2.append(str.charAt(idx));
                idx++;
            }
            else if(str.charAt(idx) != str.charAt(idx-1)){
                res2.append(str.charAt(idx));
                idx++;
            }
            else{
                idx++;
            }
        }
    }

    public static void compression2(String str){
        StringBuilder res = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int idx = 0;
        while(idx<str.length()){
            if(idx==0){
                res.append(str.charAt(idx));
                res.append(map.get(str.charAt(idx)));
                idx++;
            }
            else if(str.charAt(idx) != str.charAt(idx-1)){
                res.append(str.charAt(idx));
                res.append(map.get(str.charAt(idx)));
                idx++;
            }
            else{
                idx++;
            }
        }
    }
    public static void checkPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Not Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
    public static void findGCD(int num1, int num2){
            int gcd = 1;
            for(int i=1; i<num1 && i<num2; i++){
                if(num1%i==0 && num2%i==0){
                    gcd = i;
                }
            }
            System.out.println(gcd);
    }
    public static void findLCM(int num1, int num2){
        int num;
        if(num1<num2){
            num = num1;
        }
        else{
            num = num2;
        }
        int lcm = 1;
            for(int i=num; i>=2; i--){
                if(num1%i==0 && num2%i==0){
                    lcm = i;
                }
            }
        System.out.println(lcm);
    }

    public static void printArray(double[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    //Q1 Given a stream of incoming numbers, find the average or mean of the stream at every point.
    int n = scn.nextInt();
    double[] arr = new double[n];
    int sum = 0;
    for(int i=1; i<=n; i++){
        sum = sum + scn.nextInt();
        arr[i] = sum/i;
    }
    printArray(arr);
    // Example 1:
    // Input:
    // n = 5
    // arr[] = {10, 20, 30, 40, 50}
    // Output: 10.00 15.00 20.00 25.00 30.00 
    // Explanation: 
    // 10 / 1 = 10.00
    // (10 + 20) / 2 = 15.00
    // (10 + 20 + 30) / 3 = 20.00
    // And so on.


    // Q2 Given a list of names, display the longest name.
    // Example:
    // Input:
    // N = 5
    // names[] = { "God", "Godz", "Godzilla",
    // "Coedify", "Jerry" }
    // Output:
    // Godzilla
    //Solution Video: Module 7 Q1 longest name.mp4
    int n1 = scn.nextInt();
    int maxLength = 0;
    String maxString = "";
    String[] arr1 = new String[n1];
    for(int i=0; i<arr1.length; i++){
        arr1[i] = scn.next();
        if(arr1[i].length()>maxLength){
            maxLength = arr1[i].length();
            maxString = arr1[i];
        }
    }
    System.out.println(maxString);

    // Q3 Given a string S as input. Delete the characters at odd indices of the string.
    // Example 1:
    // Input: S = "Geeks"
    // Output: "Ges" 
    // Explanation: Deleted "e" at index 1
    // and "k" at index 3.
    // Example 2:
    // Input: S = "GeeksforGeeks"
    // Output: "GesoGes"
    // Explanation: Deleted e, k, f, r, e
    // k at index 1, 3, 5, 7, 9, 11.
    String str = scn.next();
    char[] chArr = str.toCharArray();

    StringBuilder res = new StringBuilder();
    for(int i=0; i<chArr.length; i=i+2){
        res = res.append(chArr[i]);
    }
    System.out.println(res.toString());


    // Q4 Given a string S which consists of alphabets , numbers and special characters. You need to write a program to split the strings in three different strings S1, S2 and S3 such that the string S1 will contain all the alphabets present in S , the string S2 will contain all the numbers present in S and S3 will contain all special characters present in S.  The strings S1, S2 and S3 should have characters in same order as they appear in input.
    // Example 1:
    // Input:
    // S = **Docoding123456789everyday##
    // Output:
    // Docodingeveryday
    // 123456789
    // **##
    String strr = scn.next();
    StringBuilder charString = new StringBuilder();
    StringBuilder numString = new StringBuilder();
    StringBuilder spclString = new StringBuilder();
    for(int i=0; i<strr.length(); i++){
        char ch = strr.charAt(i);
        if(Character.isAlphabetic(ch)){
            charString = charString.append(ch);
        }
        else if(ch>='0' && ch<=9){
            numString = numString.append(ch);
        }
        else{
            spclString = spclString.append(ch);
        }
    }
    System.out.println(charString.toString());
    System.out.println(numString.toString());
    System.out.println(spclString.toString());

    // Q5 Given a string of a constant length, print a triangle out of it. The triangle should start with the given string and keeps shrinking downwards by removing one character from the begining of the string. The spaces on the left side of the triangle should be replaced with dot character.
    // Example 1:
    // Input:
    // S = @io30 
    // Output:
    // @io30
    // .io30
    // ..o30
    // ...30
    // ....0 
    String sttr = scn.next();
    for(int r=0; r<sttr.length(); r++){
        for(int c=0; c<sttr.length(); c++){
            if(r>c){
                System.out.print(".");
            }
            else{
                System.out.print(sttr.charAt(c));
            }
        }
        System.out.println();
    }

    // Q6 i. You are given two numbers n and k. You are required to rotate n, k times to the right. 
    // If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. 
    // Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
    // ii. Take as input n and k.
    // iii. Print the rotated number.
    // iv. Note - Assume that the number of rotations will not cause leading 0's in the result. 
    // e.g. such an input will not be given
    // n = 12340056
    // k = 3
    // r = 05612340


    // Q7 i. You are required to print the Greatest Common Divisor (GCD) of two numbers.
    // ii. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
    // iii. Take input "num1" and "num2" as the two numbers.
    // iv. Print their GCD and LCM.
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();
    findGCD(num1,num2);
    findLCM(num1,num2);



    // Q8. Write a Program to check given string is a Palindrome or not,
    //     Eg  NITIN is a Palindrome String while PRASOON is not a Palindrome String
    String sttrr = scn.next();
    checkPalindrome(sttrr);

    // Q9. i. You are given a string. 
    //         ii. You have to print all permutations of the given string.
    // For e.g. – For Input “abc” the output will be    “abc bac cab acb bca cba “

    // Q10 i. You are given a string. 
    //     ii. You have to compress the given string in the following two ways - 
    // First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
    // For "aaabbccdee", the compressed string will be "abcde".
    String sttrrr = scn.next();
    compression(sttrrr);
    // Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
    // For "aaabbccdee", the compressed string will be "a3b2c2de2".
    //     Solution Video: MOdule 7 q10 compression.mp4
    compression2(sttrrr);
    }
}

