package Model;

import java.awt.*;

/**
 * Created by benbl on 2017-02-11.
 */
public class GhostBuster {

    private int xPOS;
    private int yPOS;




    private static final int POINTS_PER_GHOSTBUSTER = 5;
    private static final int SIZE = 5;
    private static final Color WHITE = new Color(255, 255, 255);
    private static final Color YELOW = new Color(255, 249, 157);
    private static final Color PINK = new Color(255, 131, 150);
    private static final Color RED = new Color(255, 67, 96);

    public void GhostBuster(int x, int y){
        xPOS = x;
        yPOS = y;
    }




}
