public class StaffHarian extends Staff1{
    public int jmlJamKerja;

    public StaffHarian() {
    }
    public StaffHarian(String nama, String alamat, int umur, String jk, int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, umur, jk, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    public void tampilStaffHarian() {
        System.out.println("\n============== DATA STAFF HARIAN ==============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja = " + jmlJamKerja);
        System.out.println("Gaji Bersih      = " + (gaji*jmlJamKerja+lembur-potongan));
    }
}
