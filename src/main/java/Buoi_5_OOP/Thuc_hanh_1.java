package Buoi_5_OOP;

public class Thuc_hanh_1 {
    private int id;
    private String name;
    private double price;

    public Thuc_hanh_1(){
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double thue(){

        return price * 0.1;
    }
}
