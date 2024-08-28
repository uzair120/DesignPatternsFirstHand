package G_Adapter_Facade.theater;

import G_Adapter_Facade.theater.core.*;

public class HomeTheaterFacade {

    Amplifier amplifier;
    Tuner tuner;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    Screen screen;
    Projector projector;
    TheaterLights theaterLights;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, CdPlayer cdPlayer, DvdPlayer dvdPlayer, Screen screen, Projector projector, TheaterLights theaterLights, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.screen = screen;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.popcornPopper = popcornPopper;
    }

    public void setPartyMode() {
        System.out.println("Party Mode is turning on");
        this.popcornPopper.on();
        this.popcornPopper.pop();
        this.theaterLights.dim();
        this.screen.off();
        this.projector.on();
        this.projector.tvMode();
        this.amplifier.on();
        this.dvdPlayer.on();
        this.tuner.off();
        this.dvdPlayer.play("Movie");
    }

    public void removePartyMode() {
        System.out.println("Party Mode is turning off");
        this.tuner.on();
        this.dvdPlayer.stop();
        this.amplifier.off();
        this.projector.off();
        this.screen.on();
        this.theaterLights.on();
        this.popcornPopper.off();
    }
}
