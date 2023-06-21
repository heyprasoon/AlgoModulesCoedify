public class CountOneCombinatin {
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    static void count(String s) {
        int counter=0;
        int i = Integer.parseInt(s);
        for(int j=0;j<s.length();j++){
            int temp = i%10;
            i=i/10;
            if(temp==1){
                counter++;
            }
        }
        int N=fact(counter);
        int N_R = fact(counter-2);
        int R=2;

        System.out.println(N/(N_R*R));
    }
    public static void main(String[] args) {
        String str="1001000101";
        count(str);
    }
}
