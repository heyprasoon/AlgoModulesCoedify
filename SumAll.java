public class SumAll {
    static void findSum(int l,int r){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int l=5,r=9;
        findSum(l, r);
    }
}
