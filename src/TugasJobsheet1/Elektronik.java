public class Elektronik {
    String merek;
    int tahunProduksi;

    public Elektronik(String merek, int tahunProduksi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    public void nyalakan() {
        System.out.println("Perangkat elektronik dinyalakan.");
    }

    public void matikan() {
        System.out.println("Perangkat elektronik dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("Merek          : " + merek);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}