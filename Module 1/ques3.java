import java.util.Scanner;
class OddEven{
    void odd_even(int num){
        if(num%2==0){
            System.out.println("Even Number");
        }
        else
        System.out.println("Odd Number");
    }
}
public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        OddEven oe= new OddEven();
        oe.odd_even(num);
        sc.close();
    }
}
