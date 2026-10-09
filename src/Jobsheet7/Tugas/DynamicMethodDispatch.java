class Manusia {
    public void bernafas() {
        System.out.println("Manusia bernafas");
    }
    public void makan() {
        System.out.println("Manusia makan");
    }
}
class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin dosen");
    }
    public void lembur() {
        System.out.println("Dosen sedang lembur");
    }
}
class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kantin kampus");
    }
    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();
        Manusia m3 = new Manusia();
        m1.bernafas(); 
        m1.makan();  
        m2.bernafas();
        m2.makan();     
        m3.makan();     
        ((Dosen) m1).lembur();
        ((Mahasiswa) m2).tidur();
    }
}