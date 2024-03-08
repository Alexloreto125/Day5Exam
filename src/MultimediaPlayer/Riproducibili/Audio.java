package MultimediaPlayer.Riproducibili;

import MultimediaPlayer.LettoreMultimediale;
import MultimediaPlayer.interfaces.Riproducibili;


public class Audio extends LettoreMultimediale implements Riproducibili {
    int volume;
    int durata;

    public Audio(String titolo, int volumeAudio, int durataAudio) {
        super(titolo);
        this.volume = volumeAudio;
        this.durata = durataAudio;

    }


//    @Override
//    public int getVolume() {
//        return volume;
//    }

    @Override
    public void play() {
        for (int i = 0; i < volume; i++) {
            titolo = titolo + "!";
        }
        for (int j = 0; j < durata; j++) {
//
            System.out.println(titolo);
        }
        System.out.println("TI SEI SEDUTO SUL CONCETTO DI FISTALLONE!!!!!!!!!!!");
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    //TODO FOR TESTING      play();
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
    //TODO FOR TESTING      play();
    }


}
