package Section6;

public class Wall_class {
    private double width;
    private double height;

    // 1st Constructor (no-args)
    public Wall_class() {
    }

    // 2nd Constructor
    public Wall_class(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }


    // Instance Methods:
    public double getWidth () {
        return this.width;
    }
    public double getHeight () {
        return this.height;
    }

    public void setWidth (double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setHeight (double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea () {
        return getWidth() * getHeight();
    }
}
