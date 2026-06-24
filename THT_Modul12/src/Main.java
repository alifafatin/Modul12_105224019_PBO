public class Main {
    public static void main(String[] args) {
        Database dbKampus = new coludNoSQL();

        ValidatorKRS validator = new ValidatorKRS();
        GeneratorDokumenKRS generator = new GeneratorDokumenKRS();
        RepositoriKRS repository = new RepositoriKRS(dbKampus);

        SistemKRSMAnager manager = new SistemKRSMAnager(validator, generator, repository);

        Matkul[] matakuliahList = new Matkul[] {
        new MatakulPraktikums("Matematika", 3),  
        new MatkulAsprakImpl("Fisika", 3),         
        new MatkulKKN("KKN Sukses!", 4),
};
        
        Mahasiswa tono = new Mahasiswa("Tono Santoso", new UKTReg());
        manager.prosesPengisianKRS(tono, matakuliahList);

        Mahasiswa endang = new Mahasiswa("Endang Nurhayati", new UKTBidikmisi());
        manager.prosesPengisianKRS(endang, matakuliahList);

        Mahasiswa regis = new Mahasiswa("Regis Yahyo", new UKTBKM());
        manager.prosesPengisianKRS(regis, matakuliahList);
    }
}
