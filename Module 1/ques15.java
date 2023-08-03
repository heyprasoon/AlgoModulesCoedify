import java.util.Scanner;

class checkForSmallLetter{
    void alphabet(char ch){
        if(ch>='a' && ch<='z'){
            System.out.println("small aphabet");
        }
        else{
            System.out.println("Unknown");
        }
    }

}
public class ques15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        checkForSmallLetter c=new checkForSmallLetter();
        c.alphabet(ch);
        sc.close();
    }
}
