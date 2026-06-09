//interface untuk pilihan pembayaran, agar nantinya bisa menambah metode pembayaran baru tanpa harus mengubah kode yang sudah ada
public interface PilihanPembayaran {
    void pembayaran(double jumlah); //melakukan pembayaran
    void refund(double jumlah); //jumlah uang yang akna dikembalikan
}
