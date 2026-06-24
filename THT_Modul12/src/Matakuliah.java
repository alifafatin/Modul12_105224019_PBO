public class Matakuliah {
    private String nama;
    private int sks;
    public Matakuliah(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    public int getjumlahSKS() {
        return sks;
    }

    public String getnamaMatkul() {
        return nama;
    }
}
