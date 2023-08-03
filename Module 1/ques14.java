import java.util.Scanner;

class divide{
    void div(int a, int b){
        if(b==0)
        {
            System.out.println("Not possible");
        }
        else
        {
            System.out.println(a/b);
        }
    }
}
public class ques14 {
    public static void main(String[] args) {
        divide d=new divide();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        d.div(a,b);
        sc.close();
    }
}
