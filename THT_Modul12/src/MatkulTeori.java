public class MatkulTeori implements Matkul{ //hanya membutuhkan interface dasar
    private String nama;
    private int sks;
    public MatkulTeori(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public int jumlahSKS() {
        return sks;
    }

    @Override
    public String namaMatkul() {
        return nama;
    }

}
