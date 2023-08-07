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
    public boolean CanStart(int a,int b){
        if(a<0 || b<0){
            return false;
        }
        if(a!=0 && b!=0 ){
            return false;
        }
        if(matrix[a][b]=='X'){
            return false;
        }
        return true;
    }

    public boolean Finish(int a, int b){
        if(matrix[a][b] == 0){
            return true;
        }
        return false;
    }

    public void findPath(int a, int b){
        CanStart(a, b);
        for(int i = 0; i<=nRows; i++){
            for (int j = 0; j<=nColumns; j++){
                if(matrix[a][b] == 'X'){
                    a = a + 1;
                    b = b + 1;
                }
                else {
                    a = a - 1;
                    b = b - 1;
                }

                if(matrix[a][b] == '0'){
                    matrix[a][b] = '1';
                }
            }
        }
    }
}