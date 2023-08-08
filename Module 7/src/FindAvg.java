import java.util.ArrayList;
import java.util.List;

public class FindAvg {

    public static void findAvg(int n,int arr[]){

        List<Integer> ls = new ArrayList<>();

        int sum = 0;

        for(int i=0; i<n; i++){

            sum += arr[i];

            ls.add(sum/(i+1));

        }

        System.out.println(ls);

    }

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        int n = arr.length;

        findAvg(n,arr);

    }

}
