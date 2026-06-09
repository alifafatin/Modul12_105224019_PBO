class LiberaryManager {
    private String idBuku;
    private String judulBuku;
    private String namaPengarang;

    public LiberaryManager(String idBuku, String judulBuku, String namaPengarang) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
    }

    public String getIdBuku(){
        return idBuku;
    }

    public String getJudulBuku(){
        return judulBuku;
    }

    public String getNamaPengarang(){
        return namaPengarang;
    }
}



