public class Inheritance2 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", 20, "Laki-laki", 2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();

        StaffHarian SH = new StaffHarian("Indah", "Malang", 27, "Perempuan", 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}
