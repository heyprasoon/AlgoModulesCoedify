public class TransposeMatrix {
    static void transpose(int arr[][]){
        
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && j>i){
                    int temp =0;
                    temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        for(int j=0; j<arr.length ;j++){
            for(int i=0 ; i<arr.length;i++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        transpose(matrix);
    }
}
