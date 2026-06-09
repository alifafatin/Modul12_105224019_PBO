import java.util.List;
public interface Orderss {
    void simpan(Pesanan pemesanan); //metode untuk menyimpan pemesanan

    Pesanan temukanBerdasarkanID(String idPemesanan); //metode untuk mencari pemesanan berdasarkan ID

    List<Pesanan>  findAllPemesanan(); //metode untuk mencari semua pemesanan
}
