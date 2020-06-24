package Section6;

public class Point {
    private int x;
    private int y;

    // 1st Constructor empty (no args)
    public Point () {
        this(0,0);
    }

    // 2nd Constructor
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Additional Methods
    public double distance () {
        double distance = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        return distance;
    }
    public double distance (Point point) {
        return Math.sqrt(Math.pow(this.x- point.x, 2) + Math.pow(this.y-point.y,2));
    }
    public double distance(int x, int y){
        double distance = Math.sqrt(Math.pow(this.x- x, 2) + Math.pow(this.y-y,2));
        return distance;
    }

}
