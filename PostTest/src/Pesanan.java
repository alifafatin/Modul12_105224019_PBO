public class Pesanan {
    private String orderID;
    private String namaKosumen;
    private String jumlahPesanan;
    private String status; //status pesanan
    private double totalHarga;
   
    public Pesanan(String orderID, String namaKosumen, String jumlahPesanan, String status, double totalHarga) {
        this.orderID = orderID;
        this.namaKosumen = namaKosumen;
        this.jumlahPesanan = jumlahPesanan;
        this.status = "Pending"; //status awal pesanan
        this.totalHarga = totalHarga;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getNamaKosumen() {
        return namaKosumen;
    }

    public String getJumlahPesanan() {
        return jumlahPesanan;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
