public class Keranjang {
    private ItemKeranjang[] items;
    private int jumlahItem;
    private String pesanPenuh = "";
 
    public Keranjang(int kapasitas) {
        this.items = new ItemKeranjang[kapasitas];
        this.jumlahItem = 0;
    }
    public void tambahProduk(Produk produk, int jumlah) {
        if (jumlahItem >= items.length) {
            pesanPenuh += "Keranjang penuh! " + produk.getNama() + " tidak dapat ditambahkan.\n";
            return;
        }
        items[jumlahItem] = new ItemKeranjang(produk, jumlah);  //COMPOSITION: Keranjang sendiri yang memanggil new ItemKeranjang
        jumlahItem++;
    }
    public int hitungTotal() {
        int total = 0;
        for (int i = 0; i < jumlahItem; i++) {
            total += items[i].hitungSubtotal();
        }
        return total;
    }
    public String info() {
        String info = "\nProduk: \n";
        for (int i = 0; i < jumlahItem; i++) {
            info += items[i].info();
        }
        info += pesanPenuh;
        return info;
    }
}
