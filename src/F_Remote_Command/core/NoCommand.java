package F_Remote_Command.core;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NO Command execute");
    }

    @Override
    public void undo() {
        System.out.println("NO Command undo");
    }
}
