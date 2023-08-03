import java.util.Scanner;
class NumLogic{
    void largestNum(int num1,int num2){
        if(num1<num2){
        System.out.println(num2+" is a largest number");
        }
        else
        System.out.println(num1+" is a largest number");
    }

    void smallestOfThree(int num1,int num2,int num3){
        if(num1<num2 && num1<num3)
        {
            System.out.println(num1+" is smallest");
        }
        else if(num2<num1 && num2<num3){
            System.out.println(num2+"is smallest");
        }
        else
        {
            System.out.println(num3+" is smallest");
        }
    }

    void checkPosNeg(int num){
        if(num<0)
        System.out.println("Negative");
        else
        System.out.println("Positive");
    }
}
public class ques8to10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        NumLogic n=new NumLogic();
        n.largestNum(num1,num2);
        System.out.println("Enter three numbers: ");
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        int num5=sc.nextInt();
        n.smallestOfThree(num3, num4, num5);
        System.out.println("Enter one number to check positive or negative: ");
        int num=sc.nextInt();
        n.checkPosNeg(num);
    }
    
}
