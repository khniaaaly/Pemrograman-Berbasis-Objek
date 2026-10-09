public class Utama7 {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manajer7 m[] = new Manajer7[2];
        Staff7 staff1[] = new Staff7[2];
        Staff7 staff2[] = new Staff7[3];

        m[0] = new Manajer7();
        m[0].setNama("Tedjo");
        m[0].setNip("101");
        m[0].setGolongan("1");
        m[0].setTunjangan(5000000);
        m[0].setBagian("Administrasi");

        m[1] = new Manajer7();
        m[1].setNama("Atika");
        m[1].setNip("102");
        m[1].setGolongan("1");
        m[1].setTunjangan(2500000);
        m[1].setBagian("Pemasaran");

        staff1[0] = new Staff7();
        staff1[0].setNama("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1] = new Staff7();
        staff1[1].setNama("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);
        m[0].setStaff(staff1);

        staff2[0] = new Staff7();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);

        staff2[1] = new Staff7();
        staff2[1].setNama("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);

        staff2[2] = new Staff7();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);
        m[1].setStaff(staff2);

        m[0].lihatInfo();
        m[1].lihatInfo();
    }
}
