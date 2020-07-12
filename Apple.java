import java.awt.*;

public class Apple {
    private int xCo_or, yCo_or, width, height;

    public Apple(int xCo_or, int yCo_or, int tileSize) {
        this.xCo_or = xCo_or;
        this.yCo_or = yCo_or;
        width = tileSize;
        height = tileSize;

    }

    public void tick() {

    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(xCo_or * width, yCo_or * height, width, height);
    }

    public int getxCo_or() {
        return xCo_or;
    }

    public void setxCo_or(int xCo_or) {
        this.xCo_or = xCo_or;
    }

    public int getyCo_or() {
        return yCo_or;
    }

    public void setyCo_or(int yCo_or) {
        this.yCo_or = yCo_or;
    }
}
