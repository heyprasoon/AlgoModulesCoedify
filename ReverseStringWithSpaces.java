public class ReverseStringWithSpaces {
    static void reverseString(String str){
        String [] arrOfString = str.split(" ");
        String temp = " ";
        for(int i=0 , j=arrOfString.length-1 ; i<arrOfString.length && i<j ; i++ , j--){
            temp = arrOfString[i];
            arrOfString[i]=arrOfString[j];
            arrOfString[j]=temp;
        }
        for (int k=0 ; k<arrOfString.length ; k++){
            System.out.print(arrOfString[k]+" ");
        }
    }
    public static void main(String[] args) {
        String str =" the sky is blue ";
        reverseString(str);
    }
}
