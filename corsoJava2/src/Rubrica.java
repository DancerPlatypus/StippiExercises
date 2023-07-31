import java.util.Scanner;
public class Rubrica {
    public String[] contatti;
    public String[] numeriTel;
    Scanner tastiera = new Scanner(System.in);

    public void creaRubrica(){
        System.out.println("Inserire il numero di contatti che si vogliono salvare in rubrica");
        int numeroContatti = tastiera.nextInt();
        contatti = new String[numeroContatti];
        numeriTel = new String[contatti.length];
        contatti = new String[numeroContatti];

        for(int i = 0; i<contatti.length; i++){
            System.out.println("Inserire il prossimo contatto in rubrica");
            contatti[i] = tastiera.next();

            System.out.println("Inserire il numero di telefono relativo al contatto: ");
            numeriTel[i] = tastiera.next();
        }

    }
    public String cercaNome(String nomeTarget){
        String tel = null;
        for (int i = 0; i< contatti.length; i++){
            if(nomeTarget.equalsIgnoreCase(contatti[i])){
                tel = numeriTel[i];
                break;
            }
            else{
                System.out.println("Il nome non è presente in rubrica");
                break;
            }
        }
        return tel;
    }
}
