package Model;

import java.awt.*;

/**
 * Created by benbl on 2017-02-11.
 */
public class PacMan {

    private static final int SIZE = 15;
    private static final Color COLOUR = new Color(255, 194, 31);

    private int xPOS;
    private int yPOS;

    // 1 LEFT, 2, DOWN, 3 RIGHT, 4 UP
    public static int DIRECTION;
    public static final int SPEED_PM = 8; //pixels per second, use multiples of 4

    //constructor
    public void PacMan(){
        xPOS = PMGame.CTRX;
        yPOS = PMGame.CTRY;
    }

    public int getX(){
        return xPOS;
    }

    public int getY (){
        return yPOS;
    }

    //moves PacMan at SPEED in current direction
    public void move(){
        //stub
    }

    //checks if pacman is colliding with a wall, stops him if he is
    private boolean collideWithWall(){
        return false;
    }

    //EFFECTS: returns true if PacMan has collided with any of the other in game objects.
    public boolean collidesWithGhostBuster(GhostBuster gb){
        return false;
    }

    public boolean collidesWithGhost(Ghost g){
        return false;
    }

    public boolean collidesWithCherry(Cherry c){
        return false;
    }

    public boolean collidesWithFood(Food f){
        return false;
    }




}
