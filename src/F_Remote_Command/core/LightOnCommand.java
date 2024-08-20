package F_Remote_Command.core;

public class LightOnCommand implements Command {
    Light light;
    int prev;

    public LightOnCommand(Light light) {
        this.light = light;
        this.prev = light.getStatus();
    }

    @Override
    public void execute() {
        this.prev = this.light.getStatus();
        light.on();
    }

    @Override
    public void undo() {
        if (prev == Light.DIM) {
            light.dim();
        } else if (prev == Light.OFF) {
            light.off();
        } else if (prev == Light.ON) {
            light.on();
        }
    }
}
