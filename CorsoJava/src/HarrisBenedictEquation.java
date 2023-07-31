public class HarrisBenedictEquation {
    public double calories(double peso, double altezza,  int eta, String sesso){
        double MB = 0;
        if(sesso.equals("u") || sesso.equals("uomo")){
            MB = 66 + (13.8 * peso) + (5.0 * altezza) - (6.8 * eta);
        }
        else if (sesso.equals("d") || sesso.equals("donna")){
            MB = 655 + (9.6 * peso) + (1.8 * altezza) - (4.7* eta);
        }
        else {
            System.out.println("ERROR");
        }
        return MB;
    }
    public double newCalories(int attivita,double MetBas){
        double calorieF = 0;
        System.out.println(attivita);

        if ((attivita <= 7) && (attivita >= 0)) {
            if (attivita <= 2) {
                calorieF = MetBas + MetBas * 0.20;
            } else if (attivita > 2 && attivita <= 4) {
                calorieF = MetBas + MetBas * 0.30;
            } else if (attivita > 4 && attivita <= 6) {
                calorieF = MetBas + MetBas * 0.40;
            } else {
                calorieF = MetBas + MetBas * 0.50;
            }
        } else {
            System.out.println("ERROR");
        }
        return calorieF;
    }
}
