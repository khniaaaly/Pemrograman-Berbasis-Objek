public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan: Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis: Herbivora");
        displayMakan();
        super.displayBinatang();
    }

    public void displayData() {
        displayBinatang();
        System.out.println("Suara: " + suara);
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}