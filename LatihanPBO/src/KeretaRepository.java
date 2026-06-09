import java.util.ArrayList;
import java.util.List;

public class KeretaRepository {
    private List<Kereta> daftarKereta;

    public KeretaRepository() {
        this.daftarKereta = new ArrayList<>();
        daftarKereta.add(new Kereta("KA01", "Argo Bromo", 100));
        daftarKereta.add(new Kereta("KA02", "Solo Balapan", 80));
    }

    public Kereta cariBerdasarkanKode(String kodeKereta) {
        for (Kereta k : daftarKereta) {
            if (k.getKodeKereta().equals(kodeKereta)) {
                return k;
            }
        }
        return null;
    }

    public void tampilkanJadwal() {
        System.out.println("=====================================");
        System.out.println("Jadwal Kereta Api");
        System.out.println("=====================================");
        for (Kereta k : daftarKereta) {
            System.out.println("Kode: " + k.getKodeKereta() + " | Nama: " + k.getNamaKereta() 
                + " | Kapasitas: " + k.getKapasitas() + " | Sisa Kursi: " + k.getSisaKursi());
        }
        System.out.println("=====================================");
    }
}