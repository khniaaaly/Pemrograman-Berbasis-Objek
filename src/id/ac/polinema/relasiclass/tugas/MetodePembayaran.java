public class MetodePembayaran {
    private String nama;
 
    public MetodePembayaran(String nama) {
        this.nama = nama;
    }
    public void bayar(int total) {
        System.out.println("\nPembayaran: ");
        System.out.println("> Membayar " + total + " via " + nama);
    }
}
