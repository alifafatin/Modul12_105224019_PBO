public class SistemWA implements NotifikasiWhatsapp { //kelas untuk mengirim notifikasi melalui whatsapp, implementasi dari interface NotifikasiWhatsapp
    @Override
    public void kirimNotifikasi(String nomorTelepon, String pesan) {
        System.out.println("Mengirim notifikasi WhatsApp ke: " + nomorTelepon);
        System.out.println("Pesan: " + pesan);
        System.out.println("Notifikasi WhatsApp berhasil dikirim!");
    }

}
