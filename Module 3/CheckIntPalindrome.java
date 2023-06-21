public class CheckIntPalindrome {
    static boolean checkForPalindrome(int n){
        int reverse =0 , temp=0 , toCheck =n;
        if(n<0){
            return false;
        }
        while(n>0){
            temp=n%10;
            n=n/10;
            reverse = reverse*10+temp;
        }
        if(reverse==toCheck){
            return true;
        }
    return false;
    }

    public static void main(String[] args) {
        int n=13321;
        System.out.println(checkForPalindrome(n));
    }
}
