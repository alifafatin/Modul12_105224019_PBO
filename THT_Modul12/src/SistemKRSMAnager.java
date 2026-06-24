public class SistemKRSMAnager {
    private ValidatorKRS validator;
    private GeneratorDokumenKRS generator;
    private RepositoriKRS repository;

    public SistemKRSMAnager(ValidatorKRS validator, GeneratorDokumenKRS generator, RepositoriKRS repository) {
        this.validator = validator;
        this.generator = generator;
        this.repository = repository;
    }

    public void prosesPengisianKRS(Mahasiswa mhs, Matkul[] matakuliahList){
        System.out.println("Mulai proses krs untuk... " + mhs.getNama().toUpperCase());

        int totalSKS = 0;
        for (Matkul mk : matakuliahList) {  
            if(validator.validasiSyarat(mhs, mk)){
                System.out.println("Gagal: Prasyarat " + mk.namaMatkul() + " belum terpenuhi!");
            } 

            if (mk instanceof MatkulPraktikum){
                ((MatkulPraktikum) mk).cekAlatLab();
            }
            totalSKS += mk.jumlahSKS();  
        }

        double totalUKT = mhs.hitungUKT(totalSKS);
        generator.cetakDraftKRS(mhs.getNama(), totalUKT);
        String dataKRS = "KRS Mahasiswa: " + mhs.getNama() + " dengan total SKS: " + totalSKS + " dengan total UKT: " + totalUKT;
        repository.simpanRiwayatKRS(dataKRS);

        System.out.println("Proses KRS Selesai.....");
    }
}