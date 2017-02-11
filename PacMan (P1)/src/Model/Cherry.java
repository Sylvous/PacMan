package Model;

import java.awt.*;

/**
 * Created by benbl on 2017-02-11.
 */
public class Cherry {

    private int xPOS;
    private int yPOS;

    private static final int POINTS_PER_CHERRY = 5;
    private static final int RAD = 5;
    private static final Color COLOUR = new Color(255, 0, 51);

    //Create Cherry at location x y
    public void cherry (int x, int y){
        xPOS = x;
        yPOS = y;
    }
}
