public class MatkulKKN implements Matkul{
    
    private String nama;
    private int sks;
    
    public MatkulKKN(String nama, int sks) {
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
