public class Kereta {
    private String kodeKereta;
    private String namaKereta;
    private int kapasitas;
    private int sisaKursi;

    public Kereta(String kodeKereta, String namaKereta, int kapasitas) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.kapasitas = kapasitas;
        this.sisaKursi = kapasitas;
    }

    public String getKodeKereta() { 
        return kodeKereta; 
    }
    public String getNamaKereta() { 
        return namaKereta; 
    }
    public int getKapasitas() {
         return kapasitas; 
        }
    public int getSisaKursi() {
         return sisaKursi;
         }
    public void kurangiKursi(int jumlah) { 
        this.sisaKursi -= jumlah;
     }
}