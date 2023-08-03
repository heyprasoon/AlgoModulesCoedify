class printNumbers{
    void printSum(){
        int sum=0;
        for(int i=1;i<=5;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }

    void printProduct(){
        int product=1;
        for(int i=1;i<=5;i++)
        {
            product*=i;
        }
        System.out.println(product);
    }
}
public class ques9to10 {
    public static void main(String[] args) {
        printNumbers n=new printNumbers();
        n.printSum();
        n.printProduct();
    }
}
