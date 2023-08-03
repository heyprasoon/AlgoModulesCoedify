import java.util.Scanner;

class checkForAlphabet{
    void alphabet(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Unknown");
        }
    }

}
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        checkForAlphabet c=new checkForAlphabet();
        c.alphabet(ch);
        sc.close();
    }
}

