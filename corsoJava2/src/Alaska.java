import java.util.Scanner;
public class Alaska {
    Scanner tastiera = new Scanner(System.in);
    int l = 0, m = 0;
    String[][] alaskanBands;
    public void bands (){
        System.out.println("Inserire il numero della band");
        l = tastiera.nextInt();
        System.out.print("Inserire il numero di componenti delle band");
        m = tastiera.nextInt();
        alaskanBands = new String[l][m];
        for(int i = 0; i < l; i++){
            System.out.print("Inserire il nome della band");
            alaskanBands [i][m] = tastiera.nextLine();
            for(int j = 1; j < m; j++){
                System.out.print("Inserire i componenti della band");
                alaskanBands [i][j] = tastiera.nextLine();
            }
        }
    }
    public void getAlaskanBands() {

        System.out.println("Digitare il nome della band");
        String s = tastiera.nextLine();
        for (int i = 0; i < alaskanBands.length; i++) {
            if (s.equalsIgnoreCase(alaskanBands[i][0])){
                System.out.println("I componenti delle band sono: ");
                for (int j = 1; j < alaskanBands[i].length; j++) {
                    System.out.println(alaskanBands[i][j]);
                }
                break;
            }
            else{
                    System.out.println("La band non esiste");
                    break;
                }
            }
        }
    }