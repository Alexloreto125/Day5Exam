package MultimediaPlayer.Riproducibili;

import MultimediaPlayer.LettoreMultimediale;
import MultimediaPlayer.interfaces.Riproducibili;
import MultimediaPlayer.interfaces.Visibilità;

public class Video extends LettoreMultimediale implements Riproducibili, Visibilità {
    int volume;
    int durata;

    int luminosità;

    public Video(String titolo, int volumeVideo, int durataVideo, int luminosità) {
        super(titolo);
        this.volume = volumeVideo;
        this.durata = durataVideo;
        this.luminosità = luminosità;
    }

//    public Video(String titolo) {
//        super(titolo);
//    }
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {

            String titoloPunto = titolo;
            for (int c = 0; c < volume; c++) {
                titoloPunto += "!";
            }
            String titoloAste = titoloPunto;
            for (int j = 0; j < luminosità; j++) {
                titoloAste += "*";

            }
            System.out.println(titoloAste);


        }
        System.out.println("SI E' ISPIRATO A UN ESTINTORE PER...");
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
    }

    @Override
    public void show() {

    }

    @Override
    public void alzaLuminosità() {
        this.luminosità++;
        //TODO FOR TESTING play();
    }

    @Override
    public void abbassaLuminosità() {
        this.luminosità--;
        //TODO FOR TESTING play();

    }
}
