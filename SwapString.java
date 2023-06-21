public class SwapString {
    static void swapString(String str1,String str2){
        System.out.println("Before str1= "+str1);
        System.out.println("before str2= "+str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("str1= "+str1);
        System.out.println("str2= " +str2);
    }

    public static void main(String[] args) {
        String str1="good";
        String str2="morning";
        swapString(str1,str2);
    }
}