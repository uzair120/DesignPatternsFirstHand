package F_Remote_Command.core;

public class DimLightCommand implements Command {
    Light light;
    int prev;

    public DimLightCommand(Light light) {
        this.light = light;
        prev = this.light.getStatus();
    }

    @Override
    public void execute() {
        this.prev = this.light.getStatus();
        light.dim();
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
