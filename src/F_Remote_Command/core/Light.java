package F_Remote_Command.core;

public class Light {
    public static int OFF = 0;
    public static int ON = 1;
    public static int DIM = 2;

    private int status;

    public Light() {
        this.status = Light.OFF;
    }

    public void on() {
        this.status = Light.ON;
        System.out.println("Light ON");
    }

    public void off() {
        this.status = Light.OFF;
        System.out.println("Light OFF");
    }

    public void dim() {
        this.status = Light.DIM;
        System.out.println("Dim Light");
    }

    public int getStatus() {
        return this.status;
    }
}
