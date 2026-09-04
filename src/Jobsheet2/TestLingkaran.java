public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 7;

        System.out.println("=== DATA LINGKARAN ===");
        System.out.println("Phi          : " + l1.phi);
        System.out.println("Jari-jari    : " + l1.r);
        System.out.println("Luas         : " + l1.hitungLuas());
        System.out.println("Keliling     : " + l1.hitungKeliling());
    }
}
