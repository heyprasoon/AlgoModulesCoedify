import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {

    static void doubleElement(List<Integer> list){
        System.out.println("Doubling Value");
        List<Integer> S = list.stream()
                            .map(n->n*2)
                            .collect(Collectors.toList());
        S.forEach(n->System.out.print(n+" "));
        System.out.println(" ");   
    }

    static void evenNumber(List<Integer> list){
        System.out.println("Only even number");
        List<Integer> S = list.stream()
                              .filter(n->n%2==0)
                              .collect(Collectors.toList());
        S.forEach(n->System.out.print(n+ " "));
        System.out.println(" ");
    }

    static void oddSquare(List<Integer> list){
        System.out.println("Squaring Odd one");
        List<Integer> S = list.stream()
                                .filter(n->n%2!=0)
                                .map(n->n*n).collect(Collectors.toList());
        System.out.println(S);
    }

    static void upperCase(List<String> list){
        System.out.println("Upper Casing");
        List<String> str = list.stream()
                                  .filter(n->n.charAt(0)=='A')         
                                    .map(m->m.toUpperCase())
                                    .collect(Collectors.toList());
        str.forEach(n->System.out.print(n+" "));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15,11,20,310,170,150,60);
        doubleElement(list);
        evenNumber(list);
        oddSquare(list);
        List<String> listStr = Arrays.asList("amAn","Anand","ADnan","waris","SHAN");
        upperCase(listStr);
    }
}