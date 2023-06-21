public class SubString {
    static void createSubString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                for(int k=i;k<str.length()&&k<=j;k++){
                    System.out.println(str.charAt(k));
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        createSubString("abcd");
    }
}
