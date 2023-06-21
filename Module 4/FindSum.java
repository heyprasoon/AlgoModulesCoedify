public class FindSum {
    static void findSum(String str){
        int sum=0,num=0,temp=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>47 && str.charAt(i)<58){
                num = str.charAt(i)-48;
                temp=temp*10+num;
            }
            else{
                sum=sum+temp;
                temp=0;
            }
        }
        sum = sum+temp;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String str= "123xyz321";
        findSum(str);
    }
}
