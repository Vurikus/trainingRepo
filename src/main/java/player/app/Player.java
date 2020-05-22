package player.app;

import player.playlist.Music;

import java.util.ArrayList;
import java.util.List;

public class Player {

    //Field
    private String nameApp;
    private int volume;
    private List<Music> playList = new ArrayList();

    //Constructor
    public Player() {}


    //Function
    public void playSong(){
        playList.forEach(music -> System.out.println("Name song: " + music.getSong()));
    }

    public void showProperties(){
        System.out.println(nameApp + " Volume: " + volume);
    }


    //Getter and Setter

    public List<Music> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }

    public String getNameApp() {
        return nameApp;
    }

    public void setNameApp(String nameApp) {
        this.nameApp = nameApp;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
