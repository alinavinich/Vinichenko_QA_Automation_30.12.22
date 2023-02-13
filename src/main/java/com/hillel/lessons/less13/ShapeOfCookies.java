package com.hillel.lessons.less13;

public enum ShapeOfCookies {
    ROUND("round"),
    STAR("star"),
    SQUARE("square");

    public String shape;

    ShapeOfCookies(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
