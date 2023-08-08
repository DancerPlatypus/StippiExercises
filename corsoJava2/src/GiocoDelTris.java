import java.util.Scanner;

public class GiocoDelTris {
    private char[][] griglia;

    public GiocoDelTris(){
        initGriglia();
    }

    public void initGriglia(){
        this.griglia = new char[][]{{'X', 'O', 'X'}, {'O', 'O', 'O'},{'O', 'O', 'X'}};
    }

    public void stampaOutput(){
        for(int i = 0; i<this.griglia.length; i++) {
            for (int j = 0; j < this.griglia.length; j++) {
                System.out.print(this.griglia[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean valutaRiga(){
        boolean controllo = false;

        for(int i = 0; i<this.griglia.length; i++) {
            for (int j = 1; j<this.griglia.length; j++){
                if(this.griglia[i][j] == this.griglia[i][j-1]) {
                    controllo = true;
                    break;
                }
                else {
                    i++;
                }
            }
        }
        return controllo;
    }
    public boolean valutaColonna(){
        boolean controllo = false;

        for(int j = 0; j<this.griglia.length; j++) {
            for (int i = 1; i<this.griglia.length; i++){
                if(this.griglia[i][j] == this.griglia[i-1][j]) {
                    controllo = true;
                    break;
                }
                else {
                    j++;
                }
            }
        }
        return controllo;
    }

    public boolean valutaDiagonali(){
        boolean controllo = false;
        for(int i = 0; i<this.griglia.length; i++){
            if(this.griglia[i][i] == this.griglia[i-1][i-1]){
                controllo = true;
            }
            else if (this.griglia[i][i] == this.griglia[i+1][i-1]){
                controllo = true;
            }
        }
        return controllo;
    }


    public void condizioneFinale(){


    }
    public void faiUnaMossa(char nuovaMossa){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Seleziona la casella");


    }
}
