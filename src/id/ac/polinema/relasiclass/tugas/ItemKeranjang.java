public class ItemKeranjang {
     private Produk produk;
    private int jumlah;
 
    //AGGREGATION: Produk dibuat di luar, lalu diterima lewat parameter constructor
    public ItemKeranjang(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }
    public int hitungSubtotal() {
        return produk.getHarga() * jumlah;
    }
    public String info() {
        return "- " + produk.getNama() + " x" + jumlah + " = " + hitungSubtotal() + "\n";
    }
}
