package task5_3;

public class Pen {

    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }
    private Color color;
    private boolean cap;

    public Pen(Color color) {
        this.color = color;
        this.cap = true;
    }
    public Pen() {
        this.color = Color.RED;
        this.cap = true;
    }
    public void capOff() { cap = false; }
    public void capOn() { cap = true; }
    public String draw() {
        if (cap) return "";
        return "Drawing " + color.toString();
    }
    public void changeColor(Color color) {
        if (!cap) return;
        this.color = color;
    }


}