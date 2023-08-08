public class CheckPallindrome {

    public static void check(int n, String str){

        int i =0;
        int j = n-1;

        str = str.toLowerCase();

        while(i<j){

            if(str.charAt(i) != str.charAt(j)){
                System.out.println("NO");
                return;
            }
            i++;
            j--;

        }

        System.out.println("YES");

    }

    public static void main(String[] args) {

        String s = "Nitin";
        int n = s.length();

        check(n,s);

    }

}
