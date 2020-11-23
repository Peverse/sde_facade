package app;

public class Main {

    public static void main(String[] args) {
        MasterRemote remote = new MasterRemote();

        remote.watchMovie();
        remote.stopMovie();

        remote.listenMusic();
        remote.stopMusic();

        remote.listenRadio();
        remote.stopRadio();
    }
}
