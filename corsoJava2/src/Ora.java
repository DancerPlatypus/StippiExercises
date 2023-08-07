public class Ora {
    private int ora;
    private int minuto;

    private boolean AM;

    public Ora (){
        this.ora = 0;
        this.minuto = 0;
    }

    public Ora(int ora, int minuto){
        this.ora = ora;
        this.minuto = minuto;
    }

    public Ora(int ora, int minuto, boolean AM){
        this.ora = ora;
        this.minuto = minuto;
        this.AM = true;

    }
    private boolean validaOraMinuto(int ora, int minuto){
        boolean verifica = false;

        if((ora >= 0) && (ora <= 23) && (minuto >= 0) && (minuto <= 59)){
            verifica = true;
        }
        return verifica;
    }

    public void setOra(int ore, int minuti){
        this.ora = ore;
        this.minuto = minuti;
    }

    public void setOra(int ore, int minuti, boolean AM){
        validaOraMinuto(ore, minuti);
        AM = false;
        if((ore>= 1) && (ore<=12)){
            AM = true;
        }
    }
}
