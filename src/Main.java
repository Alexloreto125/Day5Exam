import MultimediaPlayer.Immagine;
import MultimediaPlayer.Riproducibili.Audio;
import MultimediaPlayer.Riproducibili.Video;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("INSERISCI UN TITOLO: ");
//        String nomeAudio= scanner.nextLine();

        System.out.println("INSERISCI UN VOLUME: ");
        int volumeAudio= Integer.parseInt(scanner.nextLine());
        System.out.println("INSERISCI UNA DURATA: ");
        int durataAudio= Integer.parseInt(scanner.nextLine());
        Audio fistallone = new Audio("Fistallone", volumeAudio, durataAudio);
//        fistallone.alzaVolume();
//        fistallone.abbassaVolume();
        fistallone.play();




        //! AUDIO FATTO
        System.out.println("INSERISCI UN VOLUME Video: ");
        int volumeVideo= Integer.parseInt(scanner.nextLine());
        System.out.println("INSERISCI UNA DURATA Video: ");
        int durataVideo= Integer.parseInt(scanner.nextLine());
        System.out.println("INSERISCI UNA LUMINOSITA' Video: ");
        int luminositàVideo= Integer.parseInt(scanner.nextLine());
        Video meteor = new Video("Meteor", volumeVideo, durataVideo, luminositàVideo);
//        meteor.abbassaLuminosità();
//        meteor.alzaLuminosità();
        meteor.play();

         //!VIDEO FATTO


        System.out.println("INSERISCI UNA LUMINOSITA' Video: ");
        int luminositàImmagine= Integer.parseInt(scanner.nextLine());
        Immagine monocromatica = new Immagine("Lucio Fontana", luminositàImmagine);

        monocromatica.show();

    }

}