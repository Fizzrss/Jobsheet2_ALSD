public class mataKuliah09 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public mataKuliah09(){

    }

    public mataKuliah09(String idMk, String nm, int sks, int totalJam){
        kodeMk = idMk;
        nama = nm;
        this.sks = sks;
        jumlahJam = totalJam;
    }

    void tampilInformasi(){
        System.out.println("\n============================");
        System.out.println("Kode matkul: " + kodeMk);
        System.out.println("Nama matkul: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Total jam: " + jumlahJam);
    }

    void ubahSks (int sksBaru){
        sks = sksBaru;
    }

    void tambahJam (int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Maaf jam tidak dapat dikurangi");
        }
    }
}
