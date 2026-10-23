public class Program9 {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa9 mhsBiasa = new Mahasiswa9("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
    }   
}