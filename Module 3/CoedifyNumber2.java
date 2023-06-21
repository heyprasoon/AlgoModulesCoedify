public class CoedifyNumber2 {
    static void checkCoedifyNumber(int num){
        int square = num*num,i=0,temp=0,check=0,f=num;
        while (num>0){
            temp = square%10;
            square=square/10;
            num=num/10;
            check=check+(int)(temp*Math.pow(10,i));
            
            i++;
        }
        System.out.println(check);
        if(check==f)
            System.out.println(true);
        else
            System.out.println(false);
    }
    public static void main(String[] args) {
        int num = 76;
        checkCoedifyNumber(num);
    }
}