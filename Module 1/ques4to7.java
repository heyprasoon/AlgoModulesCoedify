
class print{
    void printNumberUsingFor(){
        System.out.println("Using for loop: ");
      for(int i=1;i<=100;i++)
      {
        System.out.println(i);
      }
    }

    void printNumberUsingWhile(){
      int i=1;
      System.out.println("Using while loop: ");
      while(i<=100)
      {
        System.out.println(i);
        i++;
      }
    }

    void evenNumber(){
        System.out.println("Print All even number from 1 to 100: ");
      for(int i=1;i<=100;i++)
      {
        if(i%2==0)
        System.out.println(i);
      }
    }

    void oddNumber(){
        System.out.println("Print All odd number from 1 to 100");
      for(int i=1;i<=100;i++)
      {
        if(i%2!=0)
        System.out.println(i);
      }
    }


}
public class ques4to7 {
    public static void main(String[] args) {
        print pn=new print();
        pn.printNumberUsingFor();
        pn.printNumberUsingWhile();
        pn.evenNumber();
        pn.oddNumber();   
    }
}


