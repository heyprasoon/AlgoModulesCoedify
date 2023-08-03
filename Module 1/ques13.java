import java.util.Scanner;

class printMessage{
    void marks(int num){
        if(num>90)
        {
            System.out.println("Excellent");
        }
        else if(num>80)
        {
            System.out.println("Good");
        }
        else if(num>70)
        {
            System.out.println("Fair");
        }
        else if(num>60)
        {
            System.out.println("Meets expectations");
        }
        else
        {
            System.out.println("Below bar");
        }
    }
}
public class ques13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printMessage m=new printMessage();
        m.marks(num);
        sc.close();

    }
}
