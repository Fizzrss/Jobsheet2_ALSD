public class dosen09 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public dosen09(){
        
    }

    public dosen09(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("=================================");
        System.out.println("Kode Dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Status aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }
    
    void setStatusAktif(boolean status){
        statusAktif = status;
    }
    
    int hitungMasaKerja(int thnSkrng){
        int masaKerja = thnSkrng - tahunBergabung;
        return masaKerja;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
