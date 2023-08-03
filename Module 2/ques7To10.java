class calc{
    void printTableOf5(){
        int table=1;
        for(int i=0;i<=10;i++)
        {
            table=i*5;
            System.out.println("5 * "+i+" = "+table);
        }
    }

    void sumOfTwoNum(int a,int b){
        System.out.println("Sum of two numbers are "+ (a+b));
    }

    void findDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits in a number are "+count);
    }

    void findSumOfDigits(int n){
        int sum=0,mod;
        while(n>0){
            mod=n%10;
            n=n/10;
            sum+=mod;
        }
        
        System.out.println("Sum of digits in a number are "+sum);
    }
}
public class ques7To10{
    public static void main(String[] args) {
        calc pt=new calc();
        pt.printTableOf5();
        int a=5,b=4;
        pt.sumOfTwoNum(a,b);
        int n=128;
        pt.findDigits(n);
        pt.findSumOfDigits(n);
    }
}