package G_Adapter_Facade.theater.core;

public class DvdPlayer {
    public void on() {
        System.out.println("DvdPlayer On");
    }

    public void off() {
        System.out.println("DvdPlayer Off");
    }

    public void play(String movie) {
        System.out.println("DvdPlayer Playing Movie" + movie);
    }

    public void pause() {
        System.out.println("DvdPlayer Pause");
    }

    public void stop() {
        System.out.println("DvdPlayer Stop");
    }

}
