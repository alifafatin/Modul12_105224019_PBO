public class SistemSMS implements SMSNotifier { //kelas untuk mengirim SMS, implementasi dari interface SMSNotifier
    @Override
    public void kirimSMS(String nomorTelepon, String pesan) {
        System.out.println("Mengirim SMS ke: " + nomorTelepon);
        System.out.println("Pesan: " + pesan);
        System.out.println("SMS berhasil dikirim!");
    }

}
