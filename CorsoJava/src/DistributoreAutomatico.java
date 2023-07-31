public class DistributoreAutomatico {
    public String resto(int quantitaIniziale){

        int cinquantaCent = quantitaIniziale / 50;
        quantitaIniziale = quantitaIniziale % 50;
        int ventiCent = quantitaIniziale / 20;
        quantitaIniziale = quantitaIniziale % 20;
        int dieciCent = quantitaIniziale / 10;
        quantitaIniziale = quantitaIniziale % 10;
        int cinqueCent = quantitaIniziale / 5;
        quantitaIniziale = quantitaIniziale % 5;

        String resto;
        resto = cinquantaCent + " 50Cent " + ventiCent + " 20Cent " + dieciCent + " 10Cent " + cinqueCent + " 5Cent ";
        return resto;
    }
}
