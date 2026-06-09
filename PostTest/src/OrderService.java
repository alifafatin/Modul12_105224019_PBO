public class OrderService {
    private Orderss orderRepository;
    private EmailNotifier emailNotifier;
    private SMSNotifier smsNotifier;
    private NotifikasiWhatsapp whatsAppNotifier;
    
    public OrderService(Orderss orderRepository, EmailNotifier emailNotifier, SMSNotifier smsNotifier, NotifikasiWhatsapp whatsAppNotifier) {
        this.orderRepository = orderRepository;
        this.emailNotifier = emailNotifier;
        this.smsNotifier = smsNotifier;
        this.whatsAppNotifier = whatsAppNotifier;
    }
    
    public void createOrder(String orderId, String customerName, double amount) {
        Pesanan pemesanan = new Pesanan(orderId, customerName, "1", "Pending", amount);
        orderRepository.simpan(pemesanan);
        System.out.println("Order " + orderId + " berhasil dibuat!");
    }
    
    public void processPayment(String orderId, PilihanPembayaran paymentMethod) {
        Pesanan pemesanan = orderRepository.temukanBerdasarkanID(orderId);
        
        if (pemesanan != null) {
            System.out.println("===== Memproses Pembayaran =====");
            paymentMethod.pembayaran(pemesanan.getTotalHarga());
            pemesanan.setStatus("PAID");
            System.out.println("Order " + orderId + " sudah dibayar!");
        }
    }
    
    public void notifyByEmail(String orderId, String recipientEmail) {
        Pesanan pemesanan = orderRepository.temukanBerdasarkanID(orderId);
        
        if (pemesanan != null) {
            String subjek = "Status Pesanan " + orderId;
            String pesan = "Order " + orderId + " untuk " + pemesanan.getNamaKosumen() + " sudah diterima. Total: Rp" + pemesanan.getTotalHarga();
            emailNotifier.sendEmail(recipientEmail, subjek, pesan);
        }
    }
    
    public void notifyBySMS(String orderId, String phoneNumber) {
        Pesanan pemesanan = orderRepository.temukanBerdasarkanID(orderId);
        
        if (pemesanan != null) {
            String pesan = "Order " + orderId + " sudah diterima. Terima kasih!";
            smsNotifier.kirimSMS(phoneNumber, pesan);
        }
    }
    
    public void notifyByWhatsApp(String orderId, String phoneNumber) {
        Pesanan pemesanan = orderRepository.temukanBerdasarkanID(orderId);
        
        if (pemesanan != null) {
            String pesan = "Order " + orderId + " sudah diterima. Terima kasih!";
            whatsAppNotifier.kirimNotifikasi(phoneNumber, pesan);
        }
    }
    
    public void viewAllOrders() {
        System.out.println("===== Daftar Order =====");
        for (Pesanan pemesanan : orderRepository.findAllPemesanan()) {
            System.out.println("Order ID: " + pemesanan.getOrderID() + "- Nama Konsumen - " + pemesanan.getNamaKosumen() + "- Jumlah Pesanan - " + pemesanan.getJumlahPesanan() +  "- Status - " + pemesanan.getStatus() + "- Total Harga - Rp" + pemesanan.getTotalHarga());
        }
        System.out.println("========================");
    }
}