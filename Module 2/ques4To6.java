class printSeries{
    void series1(){
        for(int i=1;i<100;i+=3){
            System.out.print(i+ " ");
        }
    }
    

    void series2(){
        int i=1;
        System.out.println();
        while(i<100){
            if(i%3==0){
                System.out.print(i+" ");
            }
            i++;
        }
        }

    void series3(){
        int num=1;
        System.out.println();
        for(int i=1;i<100 && num<99;i++){
            System.out.print(i+" ");
            num=num+2;
            System.out.print(num+" ");
        }
    }
}
public class ques4To6{
    public static void main(String[] args) {
        printSeries p=new printSeries();
        p.series1();
        p.series2();
        p.series3();
    }
}