public class Generator {
    private int daya;
    private int voltase;

    public Generator() {
    }
    public Generator(int daya, int voltase) {
        this.daya = daya;
        this.voltase = voltase;
    }
    public void setDaya(int daya) {
        this.daya = daya;
    }
    public int getDaya() {
        return daya;
    }
    public void setVoltase(int voltase) {
        this.voltase = voltase;
    }
    public int getVoltase() {
        return voltase;
    }
    
}
