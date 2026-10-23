public class Robot {
    public String Name;
    public int CPUSpeed;
    public int Power;

    public Robot(String Name, int CPUSpeed, int Power) {
        this.Name = Name;
        this.CPUSpeed = CPUSpeed;
        this.Power = Power;
    }
    public void increasePower() {
        Power += 10;
    }
    public void reducePower() {
        Power -= 10;
    }
}