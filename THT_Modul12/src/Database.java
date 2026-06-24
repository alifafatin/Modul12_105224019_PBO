public interface  Database { //menerapkan DEPENDENCY INVERSION PRINCIPLE (DIP)
    void koneksiDatabase();
    void simpanData(String data);
}
