public class SpiltByType {

    public static void spiltByType(int n , String s){

        StringBuilder character = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for(int i=0; i<n; i++){

            if(s.charAt(i) >=48 && s.charAt(i) <=57 ){

                number.append(s.charAt(i));

            }else if((s.charAt(i) >= 65 && s.charAt(i) <= 90 ) || (s.charAt(i) >=97 && s.charAt(i)<=122 )  ){
                character.append(s.charAt(i));

            }else{

                special.append(s.charAt(i));

            }

        }

        System.out.println(character);
        System.out.println(number);
        System.out.println(special);

    }

    public static void main(String[] args) {

        String S = "**Docoding123456789everyday##";
        int n = S.length();

        spiltByType(n,S);
    }
}
