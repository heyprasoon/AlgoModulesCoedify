import java.util.Scanner;

class checkForVowel{
    void alphabet(char ch){
        if((ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' ) || (ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')){
            System.out.println("Is Vowel");
        }
        else{
            System.out.println("Not a Vowel");
        }
    }

}
public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        checkForVowel c=new checkForVowel();
        c.alphabet(ch);
        sc.close();
    }
}
