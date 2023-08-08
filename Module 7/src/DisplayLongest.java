public class DisplayLongest {

    public static void displayLongest(int n, String[] names){

        int max = 0;
        int pos = 0;

        for(int i=0; i<n; i++){

            if(max < names[i].length()){

                max = names[i].length();
                pos = i;

            }

        }

        System.out.println(names[pos]);

    }

    public static void main(String[] args) {


        String names[] = { "God", "Godz", "Godzilla",
                "Coedify", "Jerry" };

        int n = names.length;

        displayLongest(n,names);

    }

}
