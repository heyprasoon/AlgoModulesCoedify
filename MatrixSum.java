import java.util.Scanner;

public class MatrixSum {

    static void sumMatrix(int mark, int[][] mat){
        int temp=0;
        for(int i=0;i<mark;i++){
            for(int j=0;j<mark;j++){
                if(i+j==mark-1||i==j){
                    temp=temp+mat[i][j];
                }
            }
        }
        System.out.println(mat.length);
        System.out.println(temp);
    }
    public static void main(String[] args) {
        System.out.println("enter the size of matrix");
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        int [][] mat = new int[mark][mark];
        System.out.println("enter the matrix");
        for(int i =0;i<mark;i++){
            for(int j=0;j<mark;j++){
                mat[i][j]=scan.nextInt();
            }
        }
        sumMatrix(mark,mat);
        scan.close();
    }
}
