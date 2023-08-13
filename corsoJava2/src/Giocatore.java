import java.util.Scanner;

public class Giocatore {

    private String nome;

    private char simbolo;
    public Giocatore(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public boolean faiUnaMossa(Sudoku partita, int r, int c){

        if ((r < 1 || r > 9) || (c < 1 || c > 9)) {
        System.out.println("Inserire un valore compreso tra 1 e 9");
        return false;
        }
        //System.out.println(partita.getGriglia()[r-1][c-1]);
        if (partita.getSudokuGrid()[r-1][c-1] == '-'){
            partita.getSudokuGrid()[r-1][c-1] = simbolo;
            return true;
        }
        else {
            System.out.println("ERRORE");
            return false;
        }
    }

}
