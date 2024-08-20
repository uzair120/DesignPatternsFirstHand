package F_Remote_Command.core;

public class LightOffCommand implements Command {
    int prev;
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
        prev = light.getStatus();
    }

    @Override
    public void execute() {
        prev = this.light.getStatus();
        this.light.off();
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
