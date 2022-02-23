package c21_reflect.pack1;

import c21_reflect.pack2.Activity;

class Point {
    //Field
    private int x;
    private int y;

    private Activity activity;

    //Constructor
    public Point() {
    }

    public Point(int x) {
        this.x = x;
    }

    public Point(Activity activity) {
        this.activity = activity;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Method
    private void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}

