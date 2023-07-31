import java.util.Scanner;
public class SelectionSort {
    static void selectionSort(String s) {
        char [] inputAr = new char[s.length()];
        for (int k = 0; k< inputAr.length; k++){
            inputAr[k] = s.charAt(k);
        }
        char temp = ' ';
        System.out.println(inputAr);
        for(int i = 0; i<inputAr.length - 1; i++){        // devo andare a ciclare per la lunghezza della stringa meno l'ultima posizione
            for (int j = i + 1; j<inputAr.length; j++){   // idem ma fino all'ultima posizione perchè j = i +1
                if((int)inputAr[i]>(int)inputAr[j]){
                    temp = inputAr[i];
                    inputAr[i] = inputAr[j];
                    inputAr[j] = temp;
                }
            }
        }
        System.out.println(inputAr);
    }
}