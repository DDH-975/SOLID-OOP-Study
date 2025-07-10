package solid.dip;

class Light {
    public void turnOn() {
        System.out.println("Light on");
    }
}

class Switch {
    private Light light;

    public Switch() {
        this.light = new Light();
    }

    public void operate() {
        light.turnOn();
    }
}

public class DIPViolation {
    public static void main(String[] args){

    }
}
