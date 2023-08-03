public class Module1{
    public static void main(String[] args){
        //1. print hello coedify to console.
		System.out.println("hello coedify");
		
		//2. write a program to swap two numbers
		 int a = 5;
		 int b = 10;
		 System.out.println("a " + a +" b "+ b);
		 
		 //2.1 swaping two nubers with the help of third variable;
		 int temp = a;
		 a = b;
		 b = temp;
		 System.out.println("a " + a +" b "+ b);
		 
		 //2.2 swapping two numbers without third variable
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 System.out.println("a " + a +" b "+ b);
		 
		//3 to check a number is even or odd
		int number = 43;
		if(number%2==0){
		    System.out.println("Even Number");
		}
		else{
		    System.out.println("Odd Number");
		}
		
		//4 print natural number using for loop
		for(int i=1; i<=100; i++){
		    System.out.print(i+" ");
		}
		
		//5 print natural number using while loop
		int j = 1;
		while(j++ <=100){
		    System.out.print(j+" ");
		}
		
		//6. java program to display even numbers
		for(int i=2; i<=100; i=i+2){
		    System.out.print(i+" ");
		}
		
		//7.  java program to display odd numbers
		for(int i=1; i<=100; i=i+2){
		    System.out.print(i+" ");
		}
		
		//8. to find largest among two numbers
		  //8.1 inbuild method
		  int x = 12;
		  int y = 15;
		  int largest = Math.max(x,y);
		  System.out.println("largest "+ largest);
		  
		  //8.2 using if-else
		  if(x<y){
		      System.out.println("y is largest");
		  }
		  else if(x>y){
		      System.out.println("x is largest");
		  }
		  else{
		      System.out.println("Both the numbers are equal");
		  }
		  
		//9 smallest of three numbers
		int p = 2;
		int q = 4;
		int r = 6;
		  int smallest = p;
		  if(p<=q && q<=r){
		      smallest = p;
		  }
		  else if(q<=p && q<=r){
		      smallest = q;
		  }
		  else{
		      smallest = r;
		  }
		  System.out.println("smallest "+ smallest);
		  
	    //10 to check is number is positive or Negative
	    
	    int n = 9;
	    if(n<0){
	        System.out.println("The number is negatve");
	    }
	    else{
	        System.out.println("The number is positive");
	    }
	    
	    //11. program to sum of 5 natural numbers
	    int sum =0;
	    for(int i=1; i<=5; i++){
	        sum = sum + i;
	    }
	    System.out.println(sum);
	    
	    //12. to produc of 5 natural numbers
	    int product = 1;
	    for(int i=1; i<=5; i++){
	        product = product * i;
	    }
	    
	    //13. mark of student
	    int marks = 75;
	    if(marks > 90){
	        System.out.println("Excellent");
	    }
	    else if(marks > 80 && marks<=90){
	        System.out.println("Good");
	    }
	    else if(marks > 70 && marks <= 80){
	        System.out.println("Fair");
	    }
	    else if(marks > 60 && marks <= 70){
	        System.out.println("Meets Expectation");
	    }
	    else{
	        System.out.println("Below par");
	    }
	    
	    //14. to devide two numbers
	    int num1 = 15;
	    int num2 = 25;
	    // if(d != 0){
	        
	    // }
	    
	    //15. check alphabet is small or not
	    char ch = 'R';
	    if(ch>='a' && ch<='z'){
	        System.out.println("Small Case");
	    }
	    else{
	        System.out.println("Capital Case");
	    }
    }
}