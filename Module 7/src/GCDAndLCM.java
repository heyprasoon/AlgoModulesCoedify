public class GCDAndLCM {

    public static int GCD(int n, int m){

         if(n == 0){
             return m;
         }

        return GCD( m%n,  n);

    }

    public static int LCM(int n, int m){

        return (n*m)/GCD( n,  m);

    }

    public static void main(String[] args) {

        int n = 16;
        int m = 24;

        System.out.println(GCD( n,  m));
        System.out.println(LCM( n,  m));

    }

}
