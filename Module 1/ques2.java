
class Swap{
void Method1_swap(int a,int b){
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a="+ a+" b="+b);
}

void Method2_swap(int a,int b){
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a="+ a+" b="+b);
}
}

public class ques2{
    public static void main(String[] args) {
        int a=5,b=7;
        Swap s=new Swap();
        System.out.println("a="+a+" b="+b);
        s.Method1_swap(a,b);
        s.Method2_swap(a,b);
    }
}