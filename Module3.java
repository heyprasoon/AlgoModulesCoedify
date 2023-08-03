import java.util.Scanner;
public class Module3 {
    public static void printUsingForLoop(){
        for(int i=1; i<=5; i++){
            System.out.println("Hello CoEdify");
        }
    }
    
    public static void printUsingWhileLoop(){
        int i=1;
        while(i<=5){
            System.out.println("Hello CoEdify");
        }
    }
    
    public static void printPattern1(int a){
        for(int r=1; r<=a; r++){
            for(int c=1; c<=a; c++){
                if(c<=r){
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void printPattern2(int b){
        for(int r=1; r<=b; r++){
            for(int c=1; c<=b; c++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    
    public static void printPattern3(int d){
        for(int r=1; r<=d; r++){
            for(int c=1; c<=d; c++){
                if(c<=r){
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    
    public static void checkPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime Number");
    }
    
    public static void checkPrime2(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime Number");
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void isPresent1(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
    
    public static void isPresent2(int[] arr, int target){
        int left = 0;
        int  right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                System.out.println("true");
                return;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println("false");
    }
    
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    // Q1 Print “ Hello CoEdify “ on console five times using a for and while loop.
    printUsingForLoop();
    printUsingWhileLoop();
    // Q2 Write a programs called NumberPatternX that prompts user for the size (a non-negative integer in int); and prints the pattern as shown:
    // Enter the size: 8
    
    // 1                    
    // 1 2                    
    // 1 2 3                   
    // 1 2 3 4                    
    // 1 2 3 4 5                    
    // 1 2 3 4 5 6                    
    // 1 2 3 4 5 6 7                  
    // 1 2 3 4 5 6 7 8 
    int a = scn.nextInt();
    printPattern1(a);
     
    // Q3 Write a program called SquarePattern that prompts user for the size (a non-negative integer in int); and prints the following square pattern using two nested for-loops.
    // Enter the size: 5
    // # # # # #
    // # # # # #
    // # # # # #
    // # # # # #
    // # # # # #
    int b = scn.nextInt();
    printPattern2(b);
    
    // Q4 Write a programs called TriangularPatternX that prompts user for the size (a non-negative integer in int); and prints each of the patterns as shown:
    // Enter the size: 8
     
    // #                	
    // # #              	
    // # # #            	
    // # # # #          	
    // # # # # #        	
    // # # # # # #      	
    // # # # # # # #    	
    // # # # # # # # #  	
    int c = scn.nextInt();
    printPattern3(c);
    
    // Q5 If
    // x = 2
    // y = 5
    // z = 0
    // then find values of the following expressions:
    // a. x == 2
    // b. x != 5
    // c. x != 5 && y >= 5
    // d. z != 0 || x == 2
    // e. !(y < 10)
    // JUST write your answers in the comments of your code.
    int x = 2;
    int y = 5;
    int z = 0;
    System.out.println(x==2);  //true;
    System.out.println(x!=5);  //true;
    System.out.println(x != 5 && y >= 5);  //true
    System.out.println(!(y < 10));  //false
    
    // Q6  Write a program to find whether the given number is Prime number or not with bruteforce.
    int num = scn.nextInt();
    checkPrime(num);  //bruteforce
    
    // Q7  Write a program to find whether the given number is Prime number or not using minimum time complexity.
    // 		Solution Video: Module 3 q7,Prime.mp4
    checkPrime2(num);  //optimised
    
    // Q8   Write  a program to print all the values in an array, you have to take elements from the user.
    int size = scn.nextInt();
    int[] arr = new int[size];
    for(int i=0; i<size; i++){
        arr[i] = scn.nextInt();
    }
    printArray(arr);
    
    // Q9   Write a Program to search an element in an array ( If array is not sorted )
    // 	E.g  
    // 	INPUT
    // arr[] =[10,90,80,50,60], target = 90
    // OUTPUT→ True
    int s = scn.nextInt();
    int[] ar = new int[s];
    for(int i=0; i<s; i++){
        ar[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    isPresent1(ar,target);
    
    // Q10   Write a Program to search an element in an array if the array is sorted  ( Binary Search )
    // 	E.g
    // 	INPUT → arr[] = [10,20,30,40,50] , Target = 40
    // 	OUTPUT→ True
    int s2 = scn.nextInt();
    int[] arrr = new int[s2];
    for(int i=0; i<s2; i++){
        arrr[i] = scn.nextInt();
    }
    int target2 = scn.nextInt();
    isPresent2(arrr,target2);

	}
}
