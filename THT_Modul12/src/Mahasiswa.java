public class Mahasiswa {
    private String nama;
    private HitungUKT strategiUKT;

    public Mahasiswa(String nama, HitungUKT strategiUKT) {
        this.nama = nama;
        this.strategiUKT = strategiUKT;
    }

    public double hitungUKT(int jumlahSKS) {
        return strategiUKT.hitungUKT(jumlahSKS);
    }

    public String getNama() {
        return nama;
    }

    // public void setStrategiUKT(HitungUKT strategiUKT) {
    //     this.strategiUKT = strategiUKT;
    // }
}
