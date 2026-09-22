public class Pelanggann {
    private String nama;
    private Keranjang keranjang;

    public Pelanggann(String nama) {
        this.nama = nama;
        this.keranjang = new Keranjang(5); // COMPOSITION: Pelanggan membuat Keranjang sendiri, tanpa setter/getter Keranjang
    }
    public void belanja(Produk produk, int jumlah) {
        keranjang.tambahProduk(produk, jumlah);
    }
    // DEPENDENCY: MetodePembayaran hanya sebagai parameter, tidak disimpan sebagai atribut
    public void checkout(MetodePembayaran metode) {
        System.out.println("Nama Pelanggan: \n" + "> " + nama);
        System.out.print(keranjang.info());
        metode.bayar(keranjang.hitungTotal());
    }
}
