package app;

public class MasterRemote {
    private Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    private Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    private DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    private CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
    private Projector projector = new Projector("Top-O-Line Projector", dvd);
    private TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    private Screen screen = new Screen("Theater Screen");
    private PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    MasterRemote(){

    }

    public void watchMovie(){
        popper.on();
        popper.pop();
        lights.dim(1);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play("Avengers");
    }

    public void stopMovie(){
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenMusic(){
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play("Andries Top 10");
    }

    public void stopMusic(){
        amp.off();
        cd.eject();
        cd.off();
    }

    public void listenRadio(){
        tuner.on();
        tuner.setFrequency(101.9);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void stopRadio(){
        tuner.off();
        amp.off();
    }
}
