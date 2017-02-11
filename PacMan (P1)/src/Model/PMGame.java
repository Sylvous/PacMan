package Model;

import java.awt.event.KeyEvent;

/**
 * Created by benbl on 2017-02-11.
 */
public class PMGame {

    // WIDTH and HEGHT must be even ints
    public static final int WIDTH = 800;
    public static final int HEIGHT = 400;

    public static final int CTRX = WIDTH/2;
    public static final int CTRY = HEIGHT/2;



    private void PMControl(int keyCode) {
        if (keyCode == KeyEvent.VK_KP_LEFT || keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A)
            PacMan.DIRECTION = 1;
        else if (keyCode == KeyEvent.VK_KP_RIGHT || keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D)
            PacMan.DIRECTION = 3;
        else if (keyCode == KeyEvent.VK_KP_UP || keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W)
            PacMan.DIRECTION = 4;
        else if (keyCode == KeyEvent.VK_KP_DOWN || keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S)
            PacMan.DIRECTION = 2;
    }

}
