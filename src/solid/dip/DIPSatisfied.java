package solid.dip;

interface Switchable{
    void turnOn();
}

class Light2 implements Switchable{
    public void turnOn(){
        System.out.println("Light On");
    }
}

class Fan implements Switchable{
    public void turnOn(){
        System.out.println("Fan On");
    }
}

class Switch2{
    private Switchable device;

    public Switch2(Switchable device){
        this.device = device;
    }

    public void operate(){
        device.turnOn();
    }
}

public class DIPSatisfied {
    private static Switchable light = new Light2();
    private static Switchable fan = new Fan();

    public static void main(String[] args){
        Switch2 lightSwitch = new Switch2(light);
        Switch2 fanSwitch = new Switch2(fan);

        lightSwitch.operate();
        fanSwitch.operate();
    }
}
