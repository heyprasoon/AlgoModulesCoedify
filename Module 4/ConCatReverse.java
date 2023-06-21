public class ConCatReverse {
    static void reverse(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str1="Seb";
        String str2="Jerry";
        String str3=str1+str2;
        reverse(str3);
    }
}
