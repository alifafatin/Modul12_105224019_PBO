public class RepositoriKRS {
    private Database db; 

    public RepositoriKRS(Database db) {
        this.db = db;
    }

    public void simpanRiwayatKRS(String dataKRS) {
        db.koneksiDatabase();
        db.simpanData(dataKRS);
    }
}
