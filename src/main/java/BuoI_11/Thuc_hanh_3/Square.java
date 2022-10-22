package BuoI_11.Thuc_hanh_3;

import java.util.Scanner;

public class Square implements Polygon{
    private double side;

    public Square(){
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input side: ");
        side = input.nextDouble();
    }

    @Override
    public void calArea() {
        double v = side * side;
        System.out.println("Dien tich hinh vuong la: " + v);
    }
}
