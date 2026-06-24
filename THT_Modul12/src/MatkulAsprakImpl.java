public class MatkulAsprakImpl implements MatkulAsprak {
    private String nama;
    private int sks;

    public MatkulAsprakImpl(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public String namaMatkul() {
        return nama;
    }

    @Override
    public int jumlahSKS() {
        return sks;
    }

    @Override
    public void asistenPraktikum() {
        System.out.println("Menyiapkan asisten praktikum untuk mata kuliah " + nama);
    }
}