package Data;

public class Kendaraan {
    String nama, jenis, bersuara;
    Kendaraan(String nama, String jenis, String bersuara){
        this.nama = nama;
        this.jenis = nama;
        this.bersuara = bersuara;
    }
    public String toString(){
        return "Tipe Motor Ini Adalah" + jenis +"\nNama Motor :" + nama + "\n Suara motornya cocok untuk sunmory :" + " "+bersuara;
    }
    public void bersuara(){

    }

}
