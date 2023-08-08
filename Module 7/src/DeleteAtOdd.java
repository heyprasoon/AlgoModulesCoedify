public class DeleteAtOdd {

    public static void deleteAtOdd(int n , String str){

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){

            if(i%2==0){

                sb.append(str.charAt(i));

            }

        }

        System.out.println(sb);

    }

    public static void main(String[] args) {

        String s = "GeeksforGeeks";
        int n = s.length();

        deleteAtOdd(n,s);

    }

}
