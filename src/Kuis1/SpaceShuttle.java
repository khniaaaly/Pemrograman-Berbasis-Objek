public class SpaceShuttle {
    private String kode;
    private int berat;
    private Roket roketUtama;
    private Generator generatorUtama;

    public SpaceShuttle() {
    }
    public SpaceShuttle(String kode, int berat, Roket roketUtama, Generator generatorUtama) {
        this.kode = kode;
        this.berat = berat;
        this.roketUtama = roketUtama;
        this.generatorUtama = generatorUtama;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public void setBerat(int berat) {
        this.berat = berat;
    }
    public int getBerat() {
        return berat;
    }
    public void setRoketUtama(Roket roketUtama) {
        this.roketUtama = roketUtama;
    }
    public Roket getRoketUtama() {
        return roketUtama;
    }
    public void setGeneratorUtama(Generator generatorUtama) {
        this.generatorUtama = generatorUtama;
    }
    public Generator getGeneratorUtama() {
        return generatorUtama;
    }
    public void info() {
        System.out.println("Kode Shuttle: " + kode);
        System.out.println("Tipe roket: " + roketUtama.getTipe());
        System.out.println("Voltase generator: " + generatorUtama.getVoltase());
    }
}
