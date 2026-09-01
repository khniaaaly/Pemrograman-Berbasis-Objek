public class Proyektor extends Elektronik {
    String resolusi;
    int kecerahan;

    public Proyektor(String merek, int tahunProduksi, String resolusi, int kecerahan) {
        super(merek, tahunProduksi);
        this.resolusi = resolusi;
        this.kecerahan = kecerahan;
    }

    public void tampilkanGambar() {
        System.out.println("Proyektor menampilkan gambar.");
    }

    public void aturKecerahan() {
        System.out.println("Kecerahan proyektor sedang diatur.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== INFORMASI PROYEKTOR ===");
        super.cetakInformasi();
        System.out.println("Resolusi       : " + resolusi);
        System.out.println("Kecerahan      : " + kecerahan + " ANSI Lumens");
    }
}