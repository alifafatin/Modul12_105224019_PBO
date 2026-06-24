public class coludNoSQL implements Database{ //menerapkan DEPENDENCY INVERSION PRINCIPLE (DIP)
    @Override
    public void koneksiDatabase(){
        System.out.println("Koneksi ke Cloud NoSQL berhasil!");
    }

    @Override
    public void simpanData(String data){
        System.out.println("Menyimpan data ke Cloud NoSQL: " + data);
    }

}
