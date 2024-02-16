package Music;

public class MusicMain {
    public static void main(String[] args) {

        MusicStyles popBand = new PopMusic();
        MusicStyles rockBand = new RockMusic();
        MusicStyles classicBand = new ClassicMusic();

        MusicStyles[] bands = {popBand, rockBand, classicBand};
        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}

