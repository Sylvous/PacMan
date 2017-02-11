package Model;

import java.awt.*;

/**
 * Created by benbl on 2017-02-11.
 */
public class Ghost {

    private int xPOS;
    private int yPOS;
    public int DIRECTION;
    private boolean SPM = false;
    private int GHOST_NUM;
    private Color GHOST_COLOUR;

    private static final Color BLUE = new Color(79, 248, 255);
    private static final Color ORANGE = new Color(255, 151, 26);
    private static final Color PINK = new Color(255, 86, 174);
    private static final Color RED = new Color(255, 15, 43);


    public static final int SPEED_G = PacMan.SPEED_PM / 4 * 3;

    public void Ghost(int x, int y, int gn){
        xPOS = x;
        yPOS = y;
        GHOST_NUM = gn;
        switch (GHOST_NUM){
            case 1: GHOST_COLOUR = BLUE;
                break;
            case 2: GHOST_COLOUR = ORANGE;
                break;
            case 3: GHOST_COLOUR = PINK;
                break;
            default: GHOST_COLOUR = RED;
                break;
        }
    }

    public int getX(){
        return xPOS;
    }

    public int getY (){
        return yPOS;
    }

    //moves ghost at SPEED in current direction
    public void move(){
        //stub
    }

    // sets true if ghost sees pacman
    public boolean seesPacMan(PacMan p){
        return false;
    }

    //decides what direction to move to, follows pacman if it can see pacman.
    public void handleJunction(){
    }
}
