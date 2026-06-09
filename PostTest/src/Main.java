public class Main {
    public static void main(String[] args) {
        Orderss repo = new RiwayatPemesanan();
        EmailNotifier email = new SistemEmail();
        SMSNotifier sms = new SistemSMS();
        NotifikasiWhatsapp wa = new SistemWA();


        OrderService orderService = new OrderService(repo, email, sms, wa);


        orderService.createOrder("ORD-001", "Alifa", 150000);
        orderService.createOrder("ORD-002", "Monica", 17000);
        orderService.createOrder("ORD-003", "Haruka", 20000);
        orderService.viewAllOrders();


        PilihanPembayaran metodeOVO = new OVO("081234567890");
        orderService.processPayment("ORD-001", metodeOVO);


        orderService.notifyByWhatsApp("ORD-001", "081234567890");

  
        orderService.viewAllOrders();
    }
}