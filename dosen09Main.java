public class dosen09Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        dosen09 dosen1 = new dosen09("76yt", "Wilda Imama Sabilla", true, 2017, "Basis data");
        dosen1.tampilInformasi();
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Algoritma dan Struktur data");
        dosen1.tampilInformasi();

        System.out.println("\n---------------------------------");
        dosen09 dosen2 = new dosen09();
        dosen2.idDosen = "897yuy";
        dosen2.nama = "Rokhimatul Wakhidah";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2010;
        dosen2.bidangKeahlian = "Algoritma dan Struktur data";

        dosen2.tampilInformasi();
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Basis data");
        dosen2.tampilInformasi();
    }
}
