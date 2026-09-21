public class Processor {
    private String merk;
    private double chace;

    public Processor() {
    }
    public Processor(String merk, double chace) {
        this.merk = merk;
        this.chace = chace;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setChace(double chace) {
        this.chace = chace;
    }
    public double getChace() {
        return chace;
    }
    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Chace Memory = %.2f\n", chace);
    }
}
