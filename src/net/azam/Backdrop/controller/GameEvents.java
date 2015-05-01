package net.azam.Backdrop.controller;

/**
 * Created by nabil on 4/30/15.
 */
import net.azam.Backdrop.View.Renderer;
import net.azam.Backdrop.View.SimpleGroupRenderer;
import net.azam.Backdrop.model.Grouping;
import net.azam.Backdrop.model.Placeholder;
import net.azam.Backdrop.model.Player1;

import java.awt.Event;
import java.awt.Graphics;
public class GameEvents {
    public boolean handleEvent(Event e){
        switch(e.id){
            case Event.MOUSE_DOWN:
                break;
            case Event.MOUSE_UP:
                break;
        }
        return false;
    }

    private Grouping grouping;

    //private Placeholder placeholder;

    private Player1 player1;
    private Renderer renderer;
    public GameEvents(){
        player1 = new Player1();
        player1.setX(Grouping.WIDTH/2);
        player1.setY(Grouping.HEIGHT / 2);
        //placeholder = new Placeholder();
        //placeholder.setX(Grouping.WIDTH/3);
        //placeholder.setY(Grouping.HEIGHT / 3);
        grouping = new Grouping(player1);
        //grouping = new Grouping(placeholder);
        renderer = new SimpleGroupRenderer(grouping);
    }

    public void update(float deltaTime){

    }
    public void render(Graphics g){
renderer.render(g);
    }
}
