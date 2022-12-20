package Data;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Kendaraan[]motornya = {
                new Honda("Beat","Beat Street","Mbeer...Mbeer...Gak Beat Gak Laku"),
                new Kawasaki("KLX","Kawasaaki KLX","Breem...Breem...Gak KLX Gak Kreen"),
                new Vespa("Vespa Matic","Vespa Matic","Ngeng...Ngeng...Gak Vespa Gak Klasik")

        };

        Kendaraan pilihKendaraan;
        Random pilih = new Random();
                for (int i = 0; i< 3; i++){
                    pilihKendaraan = motornya[pilih.nextInt(motornya.length)];
                    System.out.println("\nPilihan Anda  :\n"+pilihKendaraan);
                }
    }
}
