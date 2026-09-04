public class TestBarang1 {
    public static void main(String[] args) {
        Barang1 b1 = new Barang1();

        b1.kode = "12345";
        b1.namaBarang = "Kemeja";
        b1.hargaDasar = 200000;
        b1.diskon = 0.20f;
        b1.tampilData();
    }
}
