public class SistemEmail implements EmailNotifier { //kelas untuk mengirim email, implementasi dari interface EmailNotifier
    @Override
    public void sendEmail(String alamatEmail, String subjek, String pesan) {
        System.out.println("Mengirim email ke: " + alamatEmail);
        System.out.println("Subjek: " + subjek);
        System.out.println("Pesan: " + pesan);
        System.out.println("Email berhasil dikirim!");
    }

}
