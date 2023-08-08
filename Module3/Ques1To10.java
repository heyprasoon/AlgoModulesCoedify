import java.util.Scanner;
class allQuestions{
    void ques1(){
        System.out.println("Using For Loop");
        for(int i=0;i<5;i++)
        System.out.println("Hello CoEdify");
        int i=0;
        System.out.println("Using While loop");
        while(i<5){
            System.out.println("Hello CoEdify");
            i++;
        }
    }

    void pattern1(int n){
        System.out.println("Number Pattern X:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void pattern2(int n){
        System.out.println("Square Pattern: ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("#");
            }
            System.out.println();            
        }
    }

    void pattern3(int n){
        System.out.println("Triangular Pattern X: ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    void findValues(int x,int y,int z){
        System.out.println(x==2);  //true
        System.out.println(x!=5);  //true
        System.out.println(x!=5 && y>=5); //true
        System.out.println(z!=0 || x==2); //true
        System.out.println(!(y<10)); //false
    }

    void ques6BruteForceApp(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println("Number is not Prime");
                return;
            }
        }
        System.out.println("Number is prime");

    }

    void ques7(int num){
        boolean flag=false;
        if(num<=1)
        flag=false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag=false;
            }
            else
            {
                flag=true;
            }
        }

        if(flag==true){
        System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Non-prime Number");
        }
        

    }

    void ques8(int n){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    boolean ques9_findTargetElement(int arr[],int n,int target){
        for(int i=0;i<n;i++){
            if(target==arr[i])
            return true;
        }
        return false;
    }

    boolean ques10_binarySearch(int arr[],int n,int target){
        int i=0,j=n-1,mid;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==target)
            return true;
            else if(arr[mid]>target)
            j=mid-1;
            else
            i=mid+1;
        }
        return false;
    }
}
public class Ques1To10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        allQuestions all=new allQuestions();
        all.ques1();
        System.out.println("Enter number to print the pattern: ");
        int n=sc.nextInt();
        all.pattern1(n);
        all.pattern2(n);
        all.pattern3(n);
        int x=2, y=5, z=0;
        all.findValues(x,y,z);
        System.out.println("Enter the value to find prime or not: ");
        int num=sc.nextInt();
        all.ques6BruteForceApp(num);
        all.ques7(num);
        System.out.println("Enter the number upto which you want to enter an array elements:");
        int size=sc.nextInt();
        all.ques8(size);
        int arr[] ={10,90,80,50,60};
        int target = 90;
        System.out.println(all.ques9_findTargetElement(arr,5,target));
        int arr1[] = {10,20,30,40,50} , target1 = 40;         
        System.out.println(all.ques10_binarySearch(arr1,5,target1));


    }
    
}
