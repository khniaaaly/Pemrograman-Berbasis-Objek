public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public double harga;
    public int lamaSewa;

    public double hitungHarga() {
        return lamaSewa * harga;
    }

    public void tampilData() {
        System.out.println("=== DATA PEMINJAMAN ===");
        System.out.println("ID          : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + harga);
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Total Bayar : " + hitungHarga());
    }
}
