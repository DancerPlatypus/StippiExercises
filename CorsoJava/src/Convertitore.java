import java.util.Scanner;

public class Convertitore {



    //metodo
    public double execute(double grad, char temp){
        switch (temp) {
            case 'c', 'C' -> {
                double gradiF = ((9 * grad) / 5) + 32;
                return gradiF;
            }
            case 'f', 'F' -> {
                double gradiC = (5 * (grad - 32)) / 9;
                return  gradiC;
            }
            default -> {
                System.out.println("ERROR");
                return 0;
            }
        }

    }//fine metodo

    public String getStringTemperature(char a){
        if (a == 'c' || a == 'C' )
            return "Fahrenheit";
        else if (a == 'f' || a == 'F')
            return "Celsius";
        else
            return "ERROR";
    }
}
