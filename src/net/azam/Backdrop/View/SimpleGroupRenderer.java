package net.azam.Backdrop.View;

/**
 * Created by nabil on 4/30/15.
 */
import java.awt.Color;
import java.awt.Graphics;
import net.azam.Backdrop.model.Grouping;
import net.azam.Backdrop.model.Player1;
import net.azam.Backdrop.model.Placeholder;
public class SimpleGroupRenderer implements Renderer{
    private Grouping grouping;
    public SimpleGroupRenderer(Grouping grouping){
        this.grouping = grouping;
    }
    public void render(Graphics g){
        int cellSize = 32;
        g.setColor(new Color(0,0.5f,0,0.75f));
        for (int i = 0; i <= grouping.WIDTH;i++){
            g.drawLine(i * cellSize, 0, i * cellSize, Grouping.HEIGHT * cellSize);
            if (i<=Grouping.WIDTH)
                g.drawLine(0,i*cellSize,Grouping.WIDTH*cellSize,i*cellSize);
        }
        g.setColor(new Color(0,1f,0));
        Player1 player1 = grouping.getPlayer1();
        int x = (int) (player1.getX()*cellSize);
        int y = (int) (player1.getY()*cellSize);
        g.fillOval(x+2,y+2,cellSize-4,cellSize-4);
        g.setColor(new Color(0.7f,0.5f,0f));
        g.fillRect(x+10,y+10,cellSize-20,cellSize-20);
    }
}
