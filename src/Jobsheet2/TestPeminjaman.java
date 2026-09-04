public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        p1.id = "101";
        p1.namaMember = "Nanda";
        p1.namaGame = "GTA V";
        p1.lamaSewa = 3;
        p1.harga = 15000;
        p1.tampilData();
    }
}