public class konekMYSQL implements Database { //menerapkan DEPENDENCY INVERSION PRINCIPLE (DIP)
    @Override
    public void koneksiDatabase() {
        System.out.println("Koneksi ke MySQL berhasil!");
    }

    @Override
    public void simpanData(String data) {
        System.out.println("Menyimpan data ke MySQL: " + data);
    }
}
