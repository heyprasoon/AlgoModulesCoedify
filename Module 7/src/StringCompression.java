public class StringCompression {

    public static void firstCompression(int n , String s){

        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));

        for(int i=1; i<n; i++){

            if(sb.charAt(sb.length()-1) != s.charAt(i)){

                sb.append(s.charAt(i));

            }

        }

        System.out.println(sb);

    }


    public static void secondCompression(int n , String s){

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count = 1;

        for(int i=1; i<n; i++){

            if(sb.charAt(sb.length()-1) == s.charAt(i)){

                count++;

            }else{

                sb.append(count);
                sb.append(s.charAt(i));
                count = 1;
            }

        }
        sb.append(count);

        System.out.println(sb);

    }


    public static void main(String[] args) {

        String s = "aaabbccdee";
        int n = s.length();

        firstCompression(n,s);
        secondCompression( n ,  s);
    }

}
