public class ValidasiPenumpang {
    public void validasiNIK(String nik) throws DataPenumpangTidakValidException {
        if (nik == null || nik.length() != 16) {
            throw new DataPenumpangTidakValidException("NIK tidak valid, harus 16 karakter.");
        }
    }
}