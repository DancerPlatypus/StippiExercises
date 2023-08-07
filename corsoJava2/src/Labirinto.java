import  java.util.Random;

public class Labirinto {
    int upperbound = 2;
    char matrix[][] = null;

    public Labirinto(){
        InitMatrix();
    }

    private void InitMatrix(){
        Random rand = new Random();
        matrix = new char[10][10];
        for (int i=0;i<10;i++){
            for (int j = 0; j < 10; j++) {

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
