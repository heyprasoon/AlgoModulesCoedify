public class AddStringInteger {
    static int addString(String str1,String str2){
        int tempV2=0,tempV1=0;
        for(int i=0;i<str1.length();i++){
            tempV1 = (tempV1*10)+(str1.charAt(i)-48);
        }
        for(int j=0;j<str2.length();j++){
            tempV2=(tempV2*10)+(str2.charAt(j)-48);
        }
        tempV1=tempV1+tempV2;
        return tempV1;
    }
    public static void main(String[] args) {
        String str1="23",str2="111";
        System.out.println(str1+" "+str2);
        StringBuffer sb =new StringBuffer();
        sb.append(addString(str1, str2));
        System.out.println(sb);
    }
}
