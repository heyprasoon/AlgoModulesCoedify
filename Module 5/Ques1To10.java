import java.util.Scanner;

class allQuestions{
    void ques1_NumberPatternX(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<j)
                System.out.print(" ");
                else
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void ques2_printString(){
        Scanner sc1=new Scanner(System.in);
        String s1=sc1.nextLine();
        System.out.println(s1);
    }

    void ques3_stringLength(){
        Scanner sc1=new Scanner(System.in);
        String s1=sc1.nextLine();
        //Method 1
        int n=s1.length();
        System.out.println(n);
        
    }

    void ques4_reverseString(){
        Scanner sc1=new Scanner(System.in);
        String s=sc1.nextLine();
        int i=0,j=s.length()-1;
        char temp;
        char[]ch = s.toCharArray();
        while(i<j){
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String s_new=new String(ch);
        System.out.println(s_new);

    }

    void ques5_countVowelConsonent(){
        Scanner sc1=new Scanner(System.in);
        String s=sc1.nextLine();
        int vowel_count=0, consonent_count=0;
        char[]ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='a' ||ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
            vowel_count++;
            else if((ch[i]<='Z' && 'A'<=ch[i]) || (ch[i]<='z' && 'a'<=ch[i]))
            consonent_count++;
        }
        System.out.println("Vowel count is "+ vowel_count+" and consonent count is "+ consonent_count);

    }

    void ques6_findSecondLargest(){
        int arr[]={1,5,4,17,12,13,20};
        int n=arr.length;
        int largest=Integer.MIN_VALUE,s_largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(largest<arr[i])
            {
                s_largest=largest;
                largest=arr[i];
            }
        }
        System.out.println(s_largest);
    }

    void ques7_findSecondSmallest(){
        int arr[]={1,5,4,17,12,13,20};
        int n=arr.length;
        int smallest=Integer.MAX_VALUE,s_smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(smallest>arr[i])
            {
                s_smallest=smallest;
                smallest=arr[i];
            }
            else if(s_smallest>arr[i] )
            {
                s_smallest=arr[i];
            }
        }
       
        
        System.out.println(s_smallest+" "+ smallest);
    }

    void ques8_avgOfArray(){
        int arr[]={1,2,5,4,7};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        float avg=sum/n;
        System.out.println(avg);
    }

    void ques9_avqExcepLargSmall(){
        int arr[]={1,2,5,4,7};
        int n=arr.length;
        int sum=0;
        int largest=Integer.MIN_VALUE, smallest=arr[0];
        for(int i=0;i<n;i++){
            if(largest<arr[i])
            {
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        sum-=largest+smallest;
        float avg=sum/(n-2);
        System.out.println(avg);
    }

    void ques10_countOddEven(){
        int arr[]={1,2,5,4,7};
        int n=arr.length;
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
            even++;
            else
            odd++;
        }
        System.out.println("Odd count: "+odd+" Even count: "+even);
    }

}
public class Ques1To10 {
    public static void main(String[] args) {
        allQuestions q=new allQuestions();
        //q.ques1_NumberPatternX();
        //q.ques2_printString();
        //q.ques3_stringLength();
        //q.ques4_reverseString();
        ///q.ques5_countVowelConsonent();
        //q.ques6_findSecondLargest();
        //q.ques7_findSecondSmallest();
        //q.ques8_avgOfArray();
        //q.ques9_avqExcepLargSmall();
        //q.ques10_countOddEven();
    }    
}
