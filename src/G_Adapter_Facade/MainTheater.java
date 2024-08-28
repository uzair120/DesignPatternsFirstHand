package G_Adapter_Facade;

import G_Adapter_Facade.theater.HomeTheaterFacade;
import G_Adapter_Facade.theater.core.*;

public class MainTheater {

    public static void execute() {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new CdPlayer(), new DvdPlayer(), new Screen(), new Projector(), new TheaterLights(), new PopcornPopper());
        homeTheaterFacade.setPartyMode();

        System.out.println("-----.....-----.....-----.....-----.....-----.....-----.....-----.....");
        System.out.println("-----.....-----.....-----.....Parting.....-----.....-----.....-----.....");
        System.out.println("-----.....-----.....-----.....-----.....-----.....-----.....-----.....");

        homeTheaterFacade.removePartyMode();
    }
}
