package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width");
        int width = input.nextInt();
        System.out.println("Enter height");
        int height = input.nextInt();
            HinhChuNhat hinhChuNhat = new HinhChuNhat(width, height);
        System.out.println("Your Rectangle \n"+ hinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle: "+ hinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hinhChuNhat.getArea());
    }
}
