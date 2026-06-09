public class GiftVoucher implements PilihanPembayaran {
    private String kodeVoucher; //kode voucher untuk pembayaran
    private double saldo; //saldo yang tersedia pada voucher atau yang tersisa

    public GiftVoucher(String kodeVoucher, double saldo) {
        this.kodeVoucher = kodeVoucher;
        this.saldo = saldo;
    }

    @Override //implementasi dari metode pembayaran
    public void pembayaran(double jumlah){
        if (jumlah <= saldo){
             System.out.println("Menggunakan Gift Voucher sebesar Rp" + jumlah);
             this.saldo -= jumlah; //kurangi saldo voucher
             System.out.println("Pembayaran via voucher berhasil");
        } else {
            System.out.println("Saldo voucher tidak cukup untuk pembayaran sebesar Rp" + jumlah);
        }
    }

    @Override //implementasi dari metode refund
    public void refund(double jumlah){
        //voucher kan emang gabisa refund ya, maka nanti akan mengeluarkan eror
        System.out.println("Refund tidak dapat dilakukan untuk Gift Voucher");
    }
}
