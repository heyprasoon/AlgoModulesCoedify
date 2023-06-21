public class CheckSubString {
    static void checkSubString(String str , String word){
        int count = 0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)==word.charAt(0)){
                for (int j=0 ; j<word.length();j++){
                    if(str.charAt(i+j)==word.charAt(j)){
                        count++;
                    }
                }
            }
            if(count == word.length()){
                System.out.println(word +" is sub String of "+str);
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str = "abcdefgh", word = "def" ;
        checkSubString(str, word);
    }
}
