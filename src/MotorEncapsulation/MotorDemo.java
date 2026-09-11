public class MotorDemo {
    public static void main(String[] args) {
        Motorcycle motor = new Motorcycle();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
