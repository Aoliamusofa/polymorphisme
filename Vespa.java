package Data;

public class Vespa extends Kendaraan{
    private String nama, jenis, bersuara;
    public Vespa(String nama, String jenis, String bersuara){

        super(nama, jenis, bersuara);
    }

    public void ShowHonda(){
        System.out.println("Nama Motor Honda : " + nama);
        System.out.println("Type Motor Honda : " + jenis);
    }

    @Override
    public void bersuara() {
        System.out.println("Ngeng...Ngeng...Gak Vespa Gak Klasik");
        System.out.println("====================================");
    }
}
