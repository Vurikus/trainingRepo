package player;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import player.app.Player;

public class Starter {
    //Field

    //Constructor

    //Function
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = context.getBean(Player.class);
        player.showProperties();
        System.out.println("");
        player.playSong();
    }
}
