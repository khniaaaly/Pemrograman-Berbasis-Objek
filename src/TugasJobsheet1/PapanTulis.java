public class PapanTulis {
    String warna;
    String jenis;

    public PapanTulis(String warna, String jenis) {
        this.warna = warna;
        this.jenis = jenis;
    }

    public void tulis() {
        System.out.println("Papan tulis digunakan untuk menulis.");
    }

    public void hapus() {
        System.out.println("Tulisan pada papan tulis dihapus.");
    }

    public void cetakInformasi() {
        System.out.println("=== INFORMASI PAPAN TULIS ===");
        System.out.println("Warna          : " + warna);
        System.out.println("Jenis          : " + jenis);
    }
}