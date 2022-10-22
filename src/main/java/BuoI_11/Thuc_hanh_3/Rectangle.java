package BuoI_11.Thuc_hanh_3;

import java.util.Scanner;

public class Rectangle implements Polygon{
    private double length;
    private double width;

    public Rectangle(){}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }


    @Override
    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input length: ");
        length = input.nextDouble();
        System.out.println("Input width: ");
        width = input.nextDouble();
    }

    @Override
    public void calArea() {
        double v = width * length;
        System.out.println("Dien tich cua HCN la: " + v);
    }
}
