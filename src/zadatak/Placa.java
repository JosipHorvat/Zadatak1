package zadatak;

public class Placa {

    private double placa;
    private int brojDana;
    private double iznos;

    public double satnica(){
        int brojSati = brojDana * 8;
        return placa / brojSati;
    }

    public double brojSati(){
        return Math.ceil(iznos/ satnica());
    }

    public void calculateDaysHoursWorked( double brojSati){

        int h = 0;
        int d = 0;

        for(int i = 0; i< brojSati; i++){
            ++h;
            if(h == 8){
                h = 0;
                d += 1;
            }
        }
        System.out.println(iznos + "kn zaradit ce te za: "+ d  + " dan/a i " + h +"h.");
    }


    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public void setBrojDana(int brojDana) {
        this.brojDana = brojDana;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }
}
