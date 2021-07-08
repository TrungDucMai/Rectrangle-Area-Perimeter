package com.company;

public class HinhChuNhat {
    public int width;
    public int height;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth(){
        return this.width;
    }
    public  int getHeight(){
        return this.height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return (this.width + this.width) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
