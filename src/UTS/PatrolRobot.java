public class PatrolRobot extends Robot {
    public Battery Battery;

    public PatrolRobot(String Name, int CPUSpeed, int Power, Battery battery) {
        super("PATROL 10 " + Name, CPUSpeed, Power);
        this.Battery = battery;
    }
    public void increasePower() {
        Power += 20;
    }
}