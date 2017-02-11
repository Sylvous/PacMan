package Model;

import java.awt.*;

/**
 * Created by benbl on 2017-02-11.
 */
public class Food {

    private int xPOS;
    private  int yPOS;

    private static final int POINTS_PER_FOOD = 5;
    private static final int SIZE = 2;
    private static final Color Colour = new Color(255, 255, 255);

    public void Food(int x, int y){
        xPOS = x;
        yPOS = y;
    }
}
