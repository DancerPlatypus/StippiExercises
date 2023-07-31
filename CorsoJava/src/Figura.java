import java.util.Scanner;

public class Figura {
    public void execute(){
        // System.out.println("Il programma visualizzerà a schermo la figura.");
        // System.out.println("Digitare i valori dei lati");
        // int l1, l2, l3;
        // Scanner tastiera = new Scanner(System.in);
         // l1= tastiera.nextInt();
         // l2 = tastiera.nextInt();
         // l3 = tastiera.nextInt();


        int l1, l2,l3 = 0;

        System.out.println("Il programma visualizzerà a schermo la figura.");
        System.out.println("Digitare i valori dei lati");

        Scanner tastiera = new Scanner(System.in);

        l1= tastiera.nextInt();
        l2 = tastiera.nextInt();
        l3= tastiera.nextInt();

        int diffl2l3 = 0;
        if (l3 < l2) diffl2l3 = l2 - l3;
        else diffl2l3 = l3 - l2;

        for(int i = 0; i < l1 + l2; i++){
            if (i < l2){
                System.out.print(' ');
            }
            else {
                System.out.print('*');
            }
        }
        //andiamo a capo dopo la prima linea
        System.out.print('\n');
        //resta la parte verticale, inizio dai lati obliqui
        for(int i = 0; i < l2; i++){ //for verticale
            //all'interno ciclo sulla riga
            for( int j = 0; j < l2 - i-1; j++){
                System.out.print(' ');
            }
            System.out.print('*');
            for( int j = 0; j < l1-2; j++){
                if(i-l2+1==0){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }

            }

            System.out.print('*');
            for(int j=0;j<i;j++){
                System.out.print(' ');
            }

            System.out.print('*');
            System.out.print('\n');
        }

        for(int i=0;i<l3;i++){ //nuovo ciclo verticale
            System.out.print('*');
            for(int j=0;j<l1-2;j++){
                //if(i<l3-1){
                    System.out.print(' ');
                //}
                //else{
                //     System.out.print('*');
                //}

            }
            System.out.print('*');

                if (i < diffl2l3) {
                    for (int j = 0; j < l2 - 1; j++) {
                        System.out.print(' ');
                    }
                } else {
                    for (int j = 0; j < l2 - 1 - (i - diffl2l3); j++) {
                        System.out.print(' ');
                    }

                }
                System.out.print('*');
                System.out.print('\n');

        }

        for(int i=0;i<l1;i++){
            System.out.print('*');
        }
    }
}
