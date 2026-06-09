public class Reservasi {
    private KeretaRepository keretaRepository;
    private RiwayatPesan riwayatPemesanan;
    private ValidasiPenumpang validasiPenumpang;

    public Reservasi() {
        this.keretaRepository = new KeretaRepository();
        this.riwayatPemesanan = new RiwayatPesan();
        this.validasiPenumpang = new ValidasiPenumpang();
    }

    public void pesanTiket(String kodeKereta, String nikPenumpang, String namaPenumpang, int jumlahTiket) 
            throws RuteTidakDitemukanException, TiketHabisException {
        
        validasiPenumpang.validasiNIK(nikPenumpang);

        Kereta kereta = keretaRepository.cariBerdasarkanKode(kodeKereta);  
        if (kereta == null) {
            throw new RuteTidakDitemukanException("Kereta dengan kode " + kodeKereta + " tidak ditemukan.");
        } 
        
        if (jumlahTiket > kereta.getSisaKursi()) {
            throw new TiketHabisException("Tiket untuk kereta " + kereta.getNamaKereta() + " sudah habis.", 
                                           kereta.getNamaKereta(), 
                                           kereta.getSisaKursi());
        }

        kereta.kurangiKursi(jumlahTiket);
        
        String hasil = riwayatPemesanan.tambahPesanan(namaPenumpang, nikPenumpang, jumlahTiket);
        System.out.println("Pemesanan berhasil! " + hasil);
    }

    // TAMBAHKAN METHOD INI!
    public void jadwalKereta() {
        keretaRepository.tampilkanJadwal();
    }
}