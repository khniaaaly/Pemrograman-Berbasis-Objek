public class MainKuis1 {
    public static void main(String[] args) {
        Roket roket = new Roket("Jet", 500);
        Generator generator = new Generator(1000, 110);
        SpaceShuttle shuttle = new SpaceShuttle("Apollo99", 5000, roket, generator);
        shuttle.info();
    }
}
