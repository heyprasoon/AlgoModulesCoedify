public class adjacentAlphabet {
    static void adjustAlphabets(String str){
        String modifiedStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<122){
                modifiedStr=modifiedStr+ (char)(str.charAt(i)+1);
            }
            else if(str.charAt(i)==122){
                modifiedStr=modifiedStr+ (char)(str.charAt(i)-25);
            }
            if(str.charAt(i)>=65 && str.charAt(i)<90){
                modifiedStr= modifiedStr+(char)(str.charAt(i)+1);
            }
            else if(str.charAt(i)==90){
                modifiedStr = modifiedStr+(char)(str.charAt(i)-25);
            }
            
        }
        System.out.println(modifiedStr);
    }
    public static void main(String[] args) {
        String str = "abCDWXyz";
        adjustAlphabets(str);
    }
}
