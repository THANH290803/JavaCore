package Buoi_12.Lab4;

public class employee {
    private int id;
    private String name;
    private double luong;


    public employee(int id, String name, double luong) {
        this.id = id;
        this.name = name;
        this.luong = luong;
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

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", luong=" + luong +
                '}';
    }
}
