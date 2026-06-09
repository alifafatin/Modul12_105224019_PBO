public class OVO implements PilihanPembayaran {
    private String nomorOVO;

    public OVO(String nomorOVO) {
        this.nomorOVO = nomorOVO;
    }

    @Override //implementasi dari metode pembayaran 
    public void pembayaran(double jumlah){
        System.out.println("Memproses pembayaran dengan OVO...");
        //menghubungi API OVO
        System.out.println("Menghubungi API OVO....");
        //tampilkan cnonfitm dari transaksi
         System.out.println("Melakukan pembayaran sebesar " + jumlah + " dengan OVO " + nomorOVO);
    }

    @Override //implementasi dari metode refund
    public void refund(double jumlah){
        System.out.println("Melakukan refund sebesar " + jumlah + " ke OVO " + nomorOVO);
        //Konfirmasi refund berhasil
        System.out.println("Refund berhasil cihuuy....");
    }

}
