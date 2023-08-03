import java.util.Scanner;

public class Module2 {
    public static void checkANumberisAlphabetOrNot(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Yes it is an Alphabet");
            return;
        }
        System.out.println("Not an Alphabet");
    }
    
    public static void checkAlphabetisVowelOrNot(char ch){
        if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
            System.out.println("Yes it is an Vowel");
            return;
        }
        System.out.println("Not an Alphabet");
    }
    
    public static void print(){
        System.out.println("Hello CoEdify");
    }
    
    public static void printTillHundred1(){
        for(int i=1; i<=100; i=i+3){
            System.out.print(i+" ");
        }
    }
    
    public static void printTillHundred2(){
        for(int i=3; i<=100; i=i+3){
            System.out.print(i+" ");
        }
    }
    
    public static void printTheTableOfFive(){
        for(int i=1; i<=10; i++){
            System.out.print(5*i+" ");
        }
    }
    
    public static void Printsum(int a, int b){
        System.out.println(a+b);
    }
    
    public static void NumberOfDigit(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
    
    public static void SumOfDigit(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
    
	public static void main(String[] args) {
    // Q1 Write a Program to check whether an entered number is a alphabet or not.
    Scanner scn = new Scanner(System.in);
    char ch = scn.next().charAt(0);
    checkANumberisAlphabetOrNot(ch);
    
    // Q2 Write a Program to check whether an entered alphabet is a vowel or not.
    checkAlphabetisVowelOrNot(ch);
    
    // Q3 Print “ Hello CoEdify “ on console using function.
    print();
    
    // Q4 Print the series  1 , 4, 7, 10, 13, 16....................till 100 using function
    printTillHundred1();
    
    // Q5 Print the series   3, 6, 9, 12 ...            100    using function
    printTillHundred2();
    
    // Q6 Print the series   1, 3, 2, 5, 3, 7, 4, 9, 5, 11, 6,  till 100 using function
    //printTillHundred3();
    
    // Q7 Print the table of 5 using Function
    printTheTableOfFive();
    
    // Q8 Calculate the sum of two numbers using Function
    int a = scn.nextInt();
    int b = scn.nextInt();
    Printsum(a,b);
    
    // Q9 Write a program to find number of digits in a number
    int num = scn.nextInt();
    NumberOfDigit(num);
    
    // Q10 Write a program to find sum of digits in a number
    SumOfDigit(num);

	}
}
