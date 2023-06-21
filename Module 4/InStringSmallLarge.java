public class InStringSmallLarge {
    static void checkLargestandSmallest(String str){
        String largest="";
        String smallest="";
        String tempString="";
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            if(temp==' '){
                if(largest.length()<tempString.length()){
                    largest=tempString;    
                }
                if(smallest==""){
                    smallest=tempString;
                }
                else if(smallest.length()>tempString.length()){
                    smallest=tempString;
                }
            tempString="";
            }
            else{
                tempString = tempString+temp;
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
    public static void main(String[] args) {
        String str="Hardships often prepare ordinary people for an extraordinary destiny";
        checkLargestandSmallest(str);
    }
}
