public class PalindromeString {
    static void checkLargest(String str ){
        int n=str.length(),largest=0,oddCount=0;
        int [] small= new int[26];
        int [] capital = new int[26];
        for(int i = 0 ; i < n ; i++ ){
            if(str.charAt(i)>64 && str.charAt(i)<91){
                capital[str.charAt(i)-65]++;
            }
            else if(str.charAt(i)>96 && str.charAt(i)<123){
                small[str.charAt(i)-97]++;
            }
        }
        for(int j=0;j<26;j++){
            if(small[j]%2==0){
                largest=largest+small[j];
            }
            else if(small[j]%2!=0 && small[j]>1){
                largest=largest+(small[j]-1);
            }
            else{
                oddCount++;
            }
            if(capital[j]%2==0){
                largest=largest+capital[j];
            }
            else if(capital[j]%2!=0 && capital[j]>1){
                largest=largest + (capital[j]-1);
            }
            else{
                oddCount++;
            }
        }
        if(oddCount>0){
            largest = largest+1;
        }
        System.out.println("largest length "+largest);
    }
    public static void main(String[] args) {
        String str = "aabbcccccdef";
        checkLargest(str);
    }
}
