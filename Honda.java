package Data;

public class Honda extends Kendaraan{

    private String nama, jenis , bersuara;
     public Honda(String nama, String jenis, String bersuara){

        super(nama, jenis, bersuara);
    }

    public void ShowHonda(){
        System.out.println("Nama Motor Honda : " + nama);
        System.out.println("Type Motor Honda : " + jenis);
//

    }

    @Override
    public void bersuara() {
        System.out.println("Mbeer...Mbeer...Gak Beat Gak Laku");
        System.out.println("==================================");
    }
}
