public class ReverseString {
    static void reverse(String str){
        String nstr="",temp="",str1="";
        for(int j=0 ; j<= str.length()-1 ; j++){
            if(str.charAt(j)==' '){
                str1=temp+str1;
                str1=" "+str1;
                temp="";
            }
            else{
                temp = temp + str.charAt(j);
            }
        }
        System.out.println(str1);
        temp="";
        for(int i=str1.length()-1 ; i>=0; i-- ){
            if(str1.charAt(i)==' '){
                nstr=nstr+temp;
                nstr=nstr+" ";
                temp="";
            }
            else{
                temp = temp + str1.charAt(i);
            }
        }
        System.out.println(nstr);
    }
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        reverse(str);
    }
}
