public class CoedifyNumber {
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    static void CheckForCoedifyNum(int n){
        int temp=0,sum=0,check=n;
        while(n>0){
            temp = n%10;
            n=n/10;
            temp = fact(temp);
            sum = sum+temp;
        }
        if(sum==check){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        int n=145;
        CheckForCoedifyNum(n);
    }
}
