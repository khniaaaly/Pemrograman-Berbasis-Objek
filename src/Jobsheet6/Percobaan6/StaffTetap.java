public class StaffTetap extends Staff1 {
    public String golongan;
    public int asuransi;

    public StaffTetap() {
    }
    public StaffTetap(String nama, String alamat, int umur, String jk, int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, umur, jk, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    public void tampilStaffTetap() {
        System.out.println("============== DATA STAFF TETAP ==============");
        super.tampilDataStaff();
        System.out.println("Golongan         = " + golongan);
        System.out.println("Jumlah Asuransi  = " + asuransi);
        System.out.println("Gaji Bersih      = " + (gaji+lembur-potongan-asuransi));
    }
}
