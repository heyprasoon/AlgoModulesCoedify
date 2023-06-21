public class PermutedString {
    static boolean checkPermutedString(String str1 , String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-97]++;
        }
        for(int j=0;j<str2.length();j++){
            arr[str2.charAt(j)-97]--;
        }
        for(int k=0;k<26;k++){
            if(arr[k]>0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1= "seb",str2="bas";
        System.out.println(checkPermutedString(str1, str2));
    }
}
