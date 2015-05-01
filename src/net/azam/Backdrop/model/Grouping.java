package net.azam.Backdrop.model;
import java.util.Random;
/**
 * Created by nabil on 4/30/15.
 */
public class Grouping {
    public static final int WIDTH =  480 / 32;
    public static final int HEIGHT = 320 / 32;
    private static Random random = new Random(System.currentTimeMillis());

    private Object[][] grid;
    private Player1 player1;
    //private Placeholder placeholder;
    public Grouping(Player1 player1) {
        this.player1 = player1;
        //grid[(int)player1.getY()][(int)player1.getX()] = player1;
        grid = new Object[HEIGHT][WIDTH];
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                grid[(int)player1.getY()][(int)player1.getX()] = player1;
            }
        }
    }
   /* public Grouping(Placeholder placeholder){
        this.placeholder = placeholder;
        grid[(int)placeholder.getY()][(int)placeholder.getX()] = placeholder;
        grid = new Object[HEIGHT][WIDTH];
        for (int i = 0; i<WIDTH;i++){
            for (int j=0; j<HEIGHT;j++){
                grid[j][i] = null;
            }
        }
    }*/
    public Player1 getPlayer1(){
        return player1;
    }
    //public Placeholder getPlaceholder(){
      //  return placeholder;
    //}
}
