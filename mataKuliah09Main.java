public class mataKuliah09Main {
    public static void main(String[] args) {
        mataKuliah09 matkul1 = new mataKuliah09();
        matkul1.kodeMk = "21Fe";
        matkul1.nama = "Basis data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilInformasi();
        matkul1.ubahSks(3);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(1);
        matkul1.tampilInformasi();

        mataKuliah09 matkul2 = new mataKuliah09("45tr", "Sistem Operasi", 2, 3);
        matkul2.tampilInformasi();
        matkul2.ubahSks(3);
        matkul2.tambahJam(4);
        matkul2.kurangiJam(8);
        matkul2.tampilInformasi();
        matkul2.kurangiJam(2);
        matkul2.tampilInformasi();
    }
}
