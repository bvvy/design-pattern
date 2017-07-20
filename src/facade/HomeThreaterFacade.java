package facade;

/**
 * Created by bvvy on 2017/7/20.
 */
public class HomeThreaterFacade {

    private Screen screen;
    private DvdPlayer dvdPlayer;

    public HomeThreaterFacade(Screen screen,DvdPlayer dvdPlayer) {
        this.screen = screen;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println();
        screen.on();
        dvdPlayer.play();
        System.out.println(" movie is fangying");

    }
}
