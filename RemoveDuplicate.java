public class RemoveDuplicate {
    static void removeDuplicate(String str){
        String arr ="";
        arr = arr+str.charAt(0);
        for(int i=1;i<str.length();i++){
            int count=0;
            for(int j=0;j<arr.length();j++){
                if(arr.charAt(j)==str.charAt(i)){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr= arr+str.charAt(i);
            }
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        String str = new String("bcabc");
        removeDuplicate(str);
    }
}
