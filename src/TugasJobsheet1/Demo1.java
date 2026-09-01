public class Demo1 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop(
                "ASUS",
                2024,
                16,
                15.6
        );

        Proyektor proyektor = new Proyektor(
                "Epson",
                2023,
                "Full HD",
                3600
        );

        Ubin ubin = new Ubin(
                "Putih",
                "40 x 40 cm"
        );

        PapanTulis papanTulis = new PapanTulis(
                "Putih",
                "Whiteboard"
        );

        System.out.println("-------------------------");
        laptop.cetakInformasi();
        laptop.nyalakan();
        laptop.bukaLaptop();
        laptop.jalankanProgram();
        laptop.matikan();

        System.out.println("\n-------------------------");
        proyektor.cetakInformasi();
        proyektor.nyalakan();
        proyektor.tampilkanGambar();
        proyektor.aturKecerahan();
        proyektor.matikan();

        System.out.println("\n-------------------------");
        ubin.cetakInformasi();
        ubin.pasang();
        ubin.bersihkan();

        System.out.println("\n-------------------------");
        papanTulis.cetakInformasi();
        papanTulis.tulis();
        papanTulis.hapus();
    }
}