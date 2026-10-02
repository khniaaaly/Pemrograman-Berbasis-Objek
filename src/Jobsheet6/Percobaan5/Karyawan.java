public class Karyawan {
    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan() {
    }
    public Karyawan(String nama, String alamat, int umur, String jk, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jk = jk;
        this.gaji = gaji;
    }
    public void tampilDataKaryawan() {
        System.out.println("\nNama           = " + nama);
        System.out.println("Alamat         = " + alamat);
        System.out.println("Jenis Kelamin  = " + jk);
        System.out.println("Umur           = " + umur);
        System.out.println("Gaji           = " + gaji);

    }
}
