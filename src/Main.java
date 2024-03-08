import MultimediaPlayer.Riproducibili.Audio;
import MultimediaPlayer.Riproducibili.Video;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        LettoreMultimediale fistallone= new LettoreMultimediale();

        Audio fistallone = new Audio("Fistallone", 4, 2);

//        fistallone.play();
//        fistallone.alzaVolume();
//        fistallone.abbassaVolume();

        //! AUDIO FATTO

        Video meteor= new Video("Meteor", 3,3,1);
        meteor.play();
    }
}