public class Ubin {
    String warna;
    String ukuran;

    public Ubin(String warna, String ukuran) {
        this.warna = warna;
        this.ukuran = ukuran;
    }

    public void pasang() {
        System.out.println("Ubin dipasang pada lantai.");
    }

    public void bersihkan() {
        System.out.println("Ubin sedang dibersihkan.");
    }

    public void cetakInformasi() {
        System.out.println("=== INFORMASI UBIN ===");
        System.out.println("Warna          : " + warna);
        System.out.println("Ukuran         : " + ukuran);
    }
}