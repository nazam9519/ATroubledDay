/**
 * Created by nabil on 4/30/15.
 */
package net.azam.Backdrop;
import net.azam.Backdrop.controller.GameEvents;

import java.applet.Applet;
import  java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class BackDrop extends Applet implements Runnable{
    private static final long serialVersionUID = -2472397668493332423L;
    private GameEvents engine = new GameEvents();
    public void start(){
        new Thread(this).start();
    }

    public void run(){
        setSize(480, 320);

        BufferedImage screen = new BufferedImage(480, 320, BufferedImage.TYPE_INT_RGB);
        Graphics g = screen.getGraphics();
        Graphics appletGraphics = getGraphics();

        long delta = 01;

        while (true){
            long lastTime = System.nanoTime();
            g.setColor(Color.pink);
            g.fillRect(0, 0, 480, 320);
            engine.update((float)(delta/1000000000.0));
            engine.render(g);
            appletGraphics.drawImage(screen, 0, 0, null);

            delta = System.nanoTime() - lastTime;
            if(delta < 20000000L){
                try{
                    Thread.sleep((20000000L - delta) / 1000000L);
                }catch(Exception e){

                }
            }
            if (!isActive()){
                return;
            }
        }
    }
    public boolean handleEvent(Event e){
        return engine.handleEvent(e);
    }
}
