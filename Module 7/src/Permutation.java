import java.lang.reflect.Array;
import java.util.Arrays;

public class Permutation {

    public static void permutation(int n,char[] str,int idx){

        if(n<= idx){
            System.out.println(Arrays.toString(str));
            return;
        }

        for(int i=idx; i<n; i++){

            swap(i,idx,str);
            permutation(n,str,idx+1);
            swap(idx,i,str);
        }

    }

    public static void swap(int i,int j , char[] str){

        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

    }

    public static void main(String[] args) {

        char str[] = {'a','b','c'};
        int n = str.length;

        permutation(n,str,0);

    }

}
