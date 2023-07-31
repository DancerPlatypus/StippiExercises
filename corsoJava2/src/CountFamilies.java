import java.util.*;

public class CountFamilies {
    private int countFamilies(double max, double[] familyIncome){
        int counter = 0;
        for (int i=0; i<familyIncome.length; i++){
            if (familyIncome[i]<= (max * 0.9)){
                counter++;
            }
        }
        return counter;
    }
    public void families(int k) {
        Scanner tastiera = new Scanner(System.in);
        double[] familyIncome = new double[k];
        System.out.println("Inserire i redditi delle diverse famiglie");
        for (int i = 0; i < familyIncome.length; i++) {
            familyIncome[i] = tastiera.nextDouble();
        }
        int maxPosition = -1;
        double max = 0;
        for (int c = 0; c < familyIncome.length; c++) {
            if (familyIncome[c] > max) {
                max = familyIncome[c];
                maxPosition = c;
            }
        }
        System.out.println("Le famiglie con un reddito inferiore a " + max + " sono " + countFamilies(max, familyIncome));
    }
}
