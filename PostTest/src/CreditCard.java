public class CreditCard implements PilihanPembayaran {
    private String nomorKartu;

    public CreditCard(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    @Override //implementasi dari metode pembayaran 
    public void pembayaran(double jumlah){
        System.out.println("Memproses pembayaran dengan kartu kredit...");
        //menghubungi API bank
        System.out.println("Menghubungi API bank....");
        //tampilkan cnonfitm dari transaksi
         System.out.println("Melakukan pembayaran sebesar " + jumlah + " dengan kartu kredit " + nomorKartu);
    }

    @Deprecated //implementasi dari metode refund
    public void refund(double jumlah){
        System.out.println("Melakukan refund sebesar " + jumlah + " ke kartu kredit " + nomorKartu);
        //Konfirmasi refund berhasil
        System.out.println("Refund berhasil cihuuy....");
    }
}
