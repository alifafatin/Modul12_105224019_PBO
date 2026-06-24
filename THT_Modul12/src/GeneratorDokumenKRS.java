public class GeneratorDokumenKRS {
    public void cetakDraftKRS(String namaMahasiswa, double totalUKT) {
        System.out.println("--- MENCETAK DRAF KRS PDF ---");
        System.out.println("Kop Surat: UNIVERSITAS PERTAMINA"); // Jika kop berubah, hanya kelas ini yang diedit!
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Total UKT: Rp " + totalUKT);
        System.out.println("-----------------------------");
    }
}
