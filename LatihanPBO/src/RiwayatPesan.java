import java.util.ArrayList;
import java.util.List;

public class RiwayatPesan {
    private List<String> riwayatPesan;

    public RiwayatPesan() {
        this.riwayatPesan = new ArrayList<>();
    }
    
    public String tambahPesanan(String namaPenumpang, String nikPenumpang, int jumlahTiket) {
        String pesan = "Pesanan: " + namaPenumpang + " (NIK: " + nikPenumpang + ") - Jumlah Tiket: " + jumlahTiket;
        riwayatPesan.add(pesan);
        return pesan;
    }
}