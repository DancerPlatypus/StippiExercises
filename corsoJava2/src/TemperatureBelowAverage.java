public class TemperatureBelowAverage {
    private long getAverage(int[] temperature){
        long average = 0;
        for (int i = 0; i<temperature.length; i++){
            average = average + temperature[i];
        }
        average = average / temperature.length;
        return Math.round(average);
    }
    public void belowAverage(int[] temperature){
        TemperatureBelowAverage tba = new TemperatureBelowAverage();
        double average = tba.getAverage(temperature);
        int counter = 0;
        for (int i=0; i<temperature.length; i++){
            if (temperature[i] < average){
                System.out.println("La temperatura al di sotto della media " + average + " è: " + temperature[i]);
                counter ++;
            }
        }
        System.out.println("I giorni in cui la temperatura è stata al di sotto della media sono: "+ counter);
    }
}
