package matrixtranspose;

public class MatrixTranspose {

    public static void main(String[] args) {
        int [][] m1 ={{3,2,1},
                      {4,5,6},
                      {7,8,9}};
        for (int i = 0; i < m1.length; i++){
            int j = i;
            while (j<m1.length){
                int temp = m1[i][j];
                m1[i][j] = m1[j][i];
                m1[j][i] = temp;
                j++;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + m1[i][j]);
            }
            System.out.println("");
        }
    }
    
}
