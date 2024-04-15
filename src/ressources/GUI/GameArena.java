package ressources.GUI;

import javax.swing.*;
import java.awt.*;


public class GameArena extends swingControler{
    //private Game game;

    public GameArena(GUI g){
        super(720, 600, "ARENA", g); //(game.getCurrentPlayer().getUsername() + "'s turn"),
        this.gui = g;
        //this.game = game;
        this.preparePanel();
    }

    public void preparePanel(){
        this.panel = new JPanel();
        this.panel.setLayout(new GridLayout(2,4));
        String s = "kk"; //game.getCurrentPlayer().getUsername();
        panel.add(new JLabel(s));
        System.out.println("Preparing Arena");
        System.out.println("Preparing Player Hand");

        JPanel handPanel = new JPanel(new GridLayout(1,15));

        //for (Card card : game.getCurrentPlayer().getHand()) {
        //    System.out.println("Preparing card");
        //    System.out.println(card.getName());
        //    CardView cardview = new CardView(card);
        //    handPanel.add(cardview.prepareCardView());
        //}
        panel.add(handPanel);
        this.addPanel();  
    }

    

}