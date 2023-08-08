import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class allQues{
    void ques1(int arr[],int n){
        int maxi=Integer.MIN_VALUE;
        System.out.println("Maximum element in an array: ");
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        System.out.println(maxi);
    }

    void ques2(int arr[],int n){
        int mini=Integer.MAX_VALUE;
        System.out.println("Minimum element in an array: ");
        for(int i=0;i<n;i++){
            mini=Math.min(mini,arr[i]);
        }
        System.out.println(mini);
    }

    void ques3_findDiff(int arr[],int n){
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        if(n<=1)
        System.out.println("Not possible");
        else{
        System.out.println("Difference in maximum and minimum element in an array: ");
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println(maxi-mini);

        }
    }

    void ques4_reverse(int arr[],int n){
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }

    void ques5_findFrequency(int arr[],int n){
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry i: m.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }

    }

    void ques6_copyElements(int arr[],int n){
        int arr2[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        System.out.println("Elements in second array are:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }

    void ques7_printFiboSeries(int n){
        int a=0,b=1,c;
        if(n<=0)
        System.out.println("Enter number more than 0");
        else if(n==1)
        System.out.println(a);
        else if(n==2)
        System.out.print(a+" "+b);
        else
        {
            while(n>0){
                System.out.print(a+ " ");
                c=a+b;
                a=b;
                b=c;
                n--;
            }
        }

    }

    void ques8_nthFiboNumber(int n){
        int a=0,b=1,c;
        if(n<=0)
        System.out.println("Enter number more than 0");
        else if(n==1 || n==2)
        System.out.println("1");
        
        else
        {
            for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }
        
    }

    void ques9_starPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void ques10_starPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j<=n)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Ques1To10{
    public static void main(String[] args) {
        int arr[]={2,3,4,5,9};
        int arr1[] = {10,20,20,30,25}; 
        allQues q=new allQues();
        //q.ques1(arr,arr.length);
        //q.ques2(arr,arr.length);
        //q.ques3_findDiff(arr,arr.length);
        //q.ques4_reverse(arr,arr.length);
        //q.ques5_findFrequency(arr1,arr1.length);
        //q.ques6_copyElements(arr1,arr1.length);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //q.ques7_printFiboSeries(n);
        //q.ques8_nthFiboNumber(n);
        q.ques9_starPattern(n);
        q.ques10_starPattern(n);

    }
}