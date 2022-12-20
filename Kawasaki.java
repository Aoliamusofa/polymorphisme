package Data;

public class Kawasaki extends Kendaraan{
    private String nama,jenis, bersuara;
    public Kawasaki(String nama, String jenis, String bersuara){

        super(nama, jenis, bersuara);
    }
    public void ShowHonda(){
        System.out.println("Nama Motor Honda : " + nama);
        System.out.println("Type Motor Honda : " + jenis);
    }

    @Override
    public void bersuara() {

        System.out.println("Breem...Breem...Gak KLX Gak Kreen");
        System.out.println("=================================");
    }
}
