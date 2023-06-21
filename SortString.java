public class SortString {
    static void sorString(String str){
        String result="";
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-97]++;
        }
        for(int j=0;j<26;j++){
            if(arr[j]>0){
                result=result+(char)(j+97);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "zxcbg";
        sorString(str);
    }
}
