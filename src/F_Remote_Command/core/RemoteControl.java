package F_Remote_Command.core;

public class RemoteControl {
    Command[] onCommand = new Command[7];
    Command[] offCommand = new Command[7];
    Command[] dimCommand = new Command[7];

    Command undoCommand;

    public RemoteControl() {
        for (int i = 0; i < 7; i++) {
            this.offCommand[i] = new NoCommand();
            this.onCommand[i] = new NoCommand();
            this.dimCommand[i] = new NoCommand();
        }
        this.undoCommand = new NoCommand();
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        this.onCommand[index] = onCommand;
        this.offCommand[index] = offCommand;
    }

    public void setCommand(int index, Command onCommand, Command offCommand, Command dimCommand) {
        this.onCommand[index] = onCommand;
        this.offCommand[index] = offCommand;
        this.dimCommand[index] = dimCommand;
    }

    public void setTurnOnButton(int index) {
        undoCommand = this.onCommand[index];
        this.onCommand[index].execute();
    }

    public void setTurnOffButton(int index) {
        this.undoCommand = this.offCommand[index];
        this.offCommand[index].execute();
    }

    public void setTurnDimButton(int index) {
        this.undoCommand = this.dimCommand[index];
        this.dimCommand[index].execute();
    }

    public void setUndo() {
        this.undoCommand.undo();
    }
}
