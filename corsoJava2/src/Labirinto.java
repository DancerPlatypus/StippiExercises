import  java.util.Random;

public class Labirinto {
    int upperbound = 2;
    char matrix[][] = null;

    private int nRows=10;
    private int nColumns=10;

    public Labirinto(){
        InitMatrix();
    }

    public Labirinto(int nRows,int nColumns){
        this.nRows=nRows;
        this.nColumns = nColumns;
        InitMatrix();
    }

    private void InitMatrix(){
        Random rand = new Random();
        matrix = new char[nRows][nColumns];
        for (int i=0;i<nRows;i++){
            for (int j = 0; j < nColumns; j++) {

                if(rand.nextInt(upperbound)==1){
                    matrix[i][j]='X';
                }
                else{
                    matrix[i][j]='0';
                }
            }
        }
    }

    public void PrintMatrix(){
        for (int i=0;i<10;i++){
            for (int j = 0; j < 10; j++) {

                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

}
