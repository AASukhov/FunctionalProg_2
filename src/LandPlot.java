import java.util.Random;

public class LandPlot {
    private final int length;
    private final int width;
    private final int cost;
    Random rnd = new Random();

    public LandPlot() {
        length = rnd.nextInt(100) + 60;
        width = rnd.nextInt(50) + 30;
        cost = length * width * (rnd.nextInt(500) + 300);
    }

    public int getLength() {
        return length;
    }

    public int getWidth () {
        return width;
    }

    public int getCost() {
        return cost;
    }

    public void landToString () {
        System.out.println("Участок длиной " + length + ", шириной " + width + " и ценой " + cost + " рублей");
    }

}
