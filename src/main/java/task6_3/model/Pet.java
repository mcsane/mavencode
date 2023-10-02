package task6_3.model;

public class Pet {
    private double x;
    private double y;

    public Pet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void moveTo(double curX, double curY){
        double pythX = curX - x;
        double pythY = curY - y;
        double pyth = Math.sqrt(pythX * pythX + pythY * pythY);
        if (pyth > 0) {
            x += pythX / pyth;
            y += pythY / pyth;
        }
    }
}