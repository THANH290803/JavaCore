package Buoi_6_OOP.Thuc_hanh_1;

public class Hinh_Chu_Nhat {

    public double chieu_dai;
    public double chieu_rong;

    public double Chu_vi;
    public double Dien_tich;

    public Hinh_Chu_Nhat(){}

    public Hinh_Chu_Nhat(double chieu_dai, double chieu_rong){
        this.chieu_dai = chieu_dai;
        this.chieu_rong = chieu_rong;
    }

    public double getChieu_dai() {
        return chieu_dai;
    }

    public void setChieu_dai(double chieu_dai) {
        this.chieu_dai = chieu_dai;
    }

    public double getChieu_rong() {
        return chieu_rong;
    }

    public void setChieu_rong(double chieu_rong) {
        this.chieu_rong = chieu_rong;
    }

    public double getChu_vi() {
        return (chieu_dai + chieu_rong) * 2;
    }

    public void setChu_vi(double chu_vi) {
        Chu_vi = chu_vi;
    }

    public double getDien_tich() {
        return chieu_dai * chieu_rong;
    }

    public void setDien_tich(double dien_tich) {
        Dien_tich = dien_tich;
    }

    @Override
    public String toString() {
        return "Hinh_Chu_Nhat{" +
                "chieu_dai=" + chieu_dai +
                ", chieu_rong=" + chieu_rong +
                ", Chu_vi=" + Chu_vi +
                ", Dien_tich=" + Dien_tich +
                '}';
    }
}
