package F_Remote_Command;

import F_Remote_Command.core.*;

public class MainRemote {
    public static void execute() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        Light dinningRoomLight = new Light();
        LightOnCommand dinningRoomLightOnCommand = new LightOnCommand(dinningRoomLight);
        LightOffCommand dinningRoomLightOffCommand = new LightOffCommand(dinningRoomLight);
        DimLightCommand dinningRoomLightDimCommand = new DimLightCommand(dinningRoomLight);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, dinningRoomLightOnCommand, dinningRoomLightOffCommand, dinningRoomLightDimCommand);

        remoteControl.setTurnOnButton(0);
        remoteControl.setTurnOffButton(0);


        remoteControl.setUndo();

        remoteControl.setTurnOnButton(1);
        remoteControl.setTurnOffButton(1);
        remoteControl.setUndo();
        remoteControl.setTurnDimButton(1);

    }
}
