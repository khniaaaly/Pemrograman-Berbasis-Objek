public class MainTugas {
    public static void main(String[] args) {
        Produk p1 = new Produk("Buku Java", 85000);
        Produk p2 = new Produk("Mouse", 120000);
        Produk p3 = new Produk("Pensil", 5000);
        Produk p4 = new Produk("Pen", 7000);
        Produk p5 = new Produk("Buku", 3000);
        Produk p6 = new Produk("Tipe-X", 10000);
 
        Pelanggann pelanggan = new Pelanggann("Spongebob Squarepants");
        pelanggan.belanja(p1, 2);
        pelanggan.belanja(p2, 1);
        pelanggan.belanja(p3, 5);
        pelanggan.belanja(p4, 5);
        pelanggan.belanja(p5, 2);
        pelanggan.belanja(p6, 3);
 
        MetodePembayaran qris = new MetodePembayaran("QRIS");
        pelanggan.checkout(qris);
    }
}
