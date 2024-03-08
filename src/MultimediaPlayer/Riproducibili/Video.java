package MultimediaPlayer.Riproducibili;

import MultimediaPlayer.LettoreMultimediale;
import MultimediaPlayer.interfaces.Riproducibili;
import MultimediaPlayer.interfaces.Visibilità;

public class Video extends LettoreMultimediale implements Riproducibili, Visibilità {
    int volume;
    int durata;

    int luminosità;

    public Video(String titolo, int volumeAudio, int durataAudio, int luminosità) {
        super(titolo);
        this.volume = volumeAudio;
        this.durata = durataAudio;
        this.luminosità=luminosità;
    }
    public Video(String titolo) {
        super(titolo);
    }
//    @Override
//    public int getVolume() {
//        return volume;
//    }
    @Override
    public void play() {
    for(int i= 0; i<volume; i++){
        titolo= titolo + "!";
        for (int j= 0; j<luminosità; j++){
            titolo= titolo + "*";
            for (int k= 0; k<durata;k++){
                System.out.println(titolo);
            }
        }
    }

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

    @Override
    public void alzaLuminosità() {
    this.luminosità++;
    }
    @Override
    public void abbassaLuminosità(){
    this.luminosità--;
    }
}
