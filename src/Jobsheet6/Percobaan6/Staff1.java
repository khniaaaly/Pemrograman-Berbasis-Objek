public class Staff1 extends Karyawan1{
    public int lembur, potongan;

    public Staff1() {
    }
    public Staff1(String nama, String alamat, int umur, String jk, int gaji, int lembur, int potongan) {
        super(nama, alamat, umur, jk, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    } 
    public void tampilDataStaff() {
        super.tampilDataKaryawan();
        System.out.println("Lembur           = " + lembur);
        System.out.println("Potongan         = " + potongan);
        System.out.println("Total Gaji       = " + (gaji+lembur-potongan));
    }
}
