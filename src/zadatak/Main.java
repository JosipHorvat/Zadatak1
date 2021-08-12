package zadatak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Placa placa = new Placa();

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite neto iznos vase place: ");
        placa.setPlaca(input.nextDouble());

        System.out.println("Unesite broj radnih dana: ");
        placa.setBrojDana(input.nextInt());

        System.out.println("Unesite iznos koji zelite da izracunamo: ");
        placa.setIznos(input.nextDouble());

        placa.satnica();
        placa.brojSati();

        placa.calculateDaysHoursWorked(placa.brojSati());


    }//kraj main
}
