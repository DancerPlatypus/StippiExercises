import java.util.Scanner;

public class Macchinetta {

    private Merendina[] listaDiMerendine;

    public Macchinetta (){
        listaDiMerendine = new Merendina[5];
        for (int i = 0; i<listaDiMerendine.length; i++){
            switch (i){
                case 0:
                    listaDiMerendine[i] = new Merendina("A001", 2.50F);
                    break;
                case 1:
                    listaDiMerendine[i] = new Merendina("A002", 3.50F);
                    break;
                case 2:
                    listaDiMerendine[i] = new Merendina("A003", 2.00F);
                    break;
                case 3:
                    listaDiMerendine[i] = new Merendina("A004", 1.00F);
                    break;
                case 4:
                    listaDiMerendine[i] = new Merendina("A005", 3.00F);
                    break;
            }
        }
    }

    public void stampaProdotti(){
        if(listaDiMerendine == null){
            return;
        }
        for (Merendina DIOPORCO: listaDiMerendine){
            DIOPORCO.stampaMerendina();
        }
    }

    public void erogaResto(float resto){

        float[] valoreMonete = {2.00F, 1.00F, 0.50F, 0.20F, 0.10F, 0.05F};
        Moneta[] moneteResto = new Moneta[valoreMonete.length];

        for (int i = 0; i< valoreMonete.length; i++) {
            int numeroMonete = (int) (resto / valoreMonete[i]);
            moneteResto[i] = new Moneta(numeroMonete, valoreMonete[i]);
            resto = resto % valoreMonete[i];
        }
        for (Moneta DIOCANE: moneteResto){
            DIOCANE.stampaMoneta();
        }
    }

    private boolean verifca(String codice){
        boolean verifica = false;

        if(listaDiMerendine == null){
            return verifica;
        }

        for (int i = 0; i<listaDiMerendine.length; i++){
            if(listaDiMerendine[i].getCodice().equalsIgnoreCase(codice)){
                verifica = true;
                break;
            }
        }
        return verifica;
    }

    private int trovaMerendina(String codice){
        int posizione = -1;
        if(listaDiMerendine == null){
            return posizione;
        }
        for (int i = 0; i<listaDiMerendine.length; i++){
               if(listaDiMerendine[i].getCodice().equalsIgnoreCase(codice)){
                   posizione = i;
                   break;
               }
        }
        return posizione;
    }

    public void leggiInput(){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il codice del prodotto: ");
        String codice = tastiera.nextLine();
        if (!verifca(codice)){
            System.out.println("Merendina non trovata");
            return;
        }
        int posizione = trovaMerendina(codice);
        System.out.println("Inserire le monete");
        float moneteInput = tastiera.nextFloat();
        float resto = moneteInput - listaDiMerendine[posizione].getPrezzo();
        System.out.println("Il tuo resto è di: ");
        erogaResto(resto);
    }
}
