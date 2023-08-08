import java.util.Scanner;

public class GiocoDelTris {
    private char[][] griglia;

    public GiocoDelTris(){
        this.griglia = new char[3][3];
    }

    public boolean valutaRiga(){
        boolean controllo = false;

        for(int i = 0; i<this.griglia.length; i++) {
            for (int j = 1; j<this.griglia.length; j++){
                if(this.griglia[i][j] == this.griglia[i][j-1]){
                    if (this.griglia[i][j+1] == this.griglia[i][j]){
                            controllo = true;
                            break;
                    }
                    else {
                        i++;
                    }
                }
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
