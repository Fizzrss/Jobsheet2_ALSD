public class mahasiwa09Main {
    public static void main(String[] args) { 
        mahasiswa09 mhs1 = new mahasiswa09();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilInformasi();

        mahasiswa09 mhs2 = new mahasiswa09("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilInformasi();

        mahasiswa09 mhsFiza = new mahasiswa09("Fiza Rahmatus Sholikha", "244107060109", 3.79, "SIB 1B");
        mhsFiza.tampilInformasi();
    }
}
