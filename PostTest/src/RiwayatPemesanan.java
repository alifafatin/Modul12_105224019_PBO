import java.util.List;
import java.util.ArrayList;

public class RiwayatPemesanan implements Orderss{
    private List<Pesanan> daftarPemesanan; //list untuk menyimpan semua pemesanan

    public RiwayatPemesanan() {
        daftarPemesanan = new ArrayList<>(); //inisialisasi list pemesanan
    }

    @Override
    public void simpan(Pesanan pemesanan){
        daftarPemesanan.add(pemesanan); //menambahkan pemesanan ke dalam list
    }

    @Override
    public Pesanan temukanBerdasarkanID(String idPemesanan) {
        for (Pesanan pemesanan : daftarPemesanan) { //mencari pemesanan berdasarkan ID
            if (pemesanan.getOrderID().equals(idPemesanan)) {
                return pemesanan; //jika ditemukan, kembalikan pemesanan tersebut
            }
        }
        return null; //jika tidak ditemukan, kembalikan null
    }

    @Override
    public List<Pesanan> findAllPemesanan() {
        return daftarPemesanan; //mengembalikan semua pemesanan yang ada dalam list
    }

}
