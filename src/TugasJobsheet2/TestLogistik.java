import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
        int pilihan;

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik()); 
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        do {
            System.out.println("\n=== MENU KONTAINER ===");
            System.out.println("1. Tambah Muatan");
            System.out.println("2. Turunkan Muatan");
            System.out.println("3. Lihat Muatan Saat Ini");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan berat muatan yang ingin ditambahkan: ");
                double tambah = input.nextDouble();
                kontainerAlfa.tambahMuatan(tambah);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
            } else if (pilihan == 2) {
                System.out.print("Masukkan berat muatan yang ingin diturunkan: ");
                double turun = input.nextDouble();
                kontainerAlfa.turunkanMuatan(turun);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
            } else if (pilihan == 3) {
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg"); 
            } else if (pilihan == 4) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 4);
        input.close();
    }
}