import java.util.Scanner;

public class GiocoDelTris {
    private char[][] griglia;

    public GiocoDelTris(){
        this.griglia = new char[3][3];
    }

    //Sei sicuro di valutare la riga??????
    public boolean valutaRiga(){
        boolean controllo = false;
        for(int i = 0; i<this.griglia.length; i++) {
            if(this.griglia[i][0] == 'X' || this.griglia[i][0] == 'O') {
                controllo = true;
                break;
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
