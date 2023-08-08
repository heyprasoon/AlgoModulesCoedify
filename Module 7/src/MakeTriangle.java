public class MakeTriangle {

    public static void makeTriangle(int n,String S){

        for(int i=0; i<n; i++){

            StringBuilder sb = new StringBuilder();

            for(int j=0; j<n; j++){

                if(i<=j){
                    sb.append(S.charAt(j));

                }else{

                    sb.append('.');
                }

            }

            System.out.println(sb);

        }

    }


    public static void main(String[] args) {

        String S = "@io30";
        int n = S.length();

        makeTriangle(n,S);

    }
}