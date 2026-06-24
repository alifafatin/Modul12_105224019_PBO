public class MatakulPraktikums implements MatkulAsprak, MatkulPraktikum {

    private String nama;
    private int sks;

    public MatakulPraktikums(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public void asistenPraktikum() {
        System.out.println("Menugaskan Asisten Dosen untuk lab....");
    }


    @Override
    public void cekAlatLab() {
        System.out.println("Mengecek alat lab....");
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
