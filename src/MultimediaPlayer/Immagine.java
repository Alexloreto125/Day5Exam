package MultimediaPlayer;

import MultimediaPlayer.interfaces.Visibilità;

public class Immagine extends LettoreMultimediale implements Visibilità {

    int luminosità;


    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;

    }

    @Override
    public void show() {
        for (int i = 0; i < luminosità; i++) {
            titolo += "*";
        }
        System.out.println(titolo);
        System.out.println("PRENDERNE UNO PER NON PRENDERNE 99");
    }

    @Override
    public void alzaLuminosità() {
        this.luminosità ++;

    }

    @Override
    public void abbassaLuminosità() {
this.luminosità--;
    }
}
