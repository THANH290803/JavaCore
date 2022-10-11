package Buoi_6_OOP.Thuc_hanh_1;

public class Hinh_vuong extends Hinh_Chu_Nhat{
    double canh;

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getDien_tich() {
        return canh * canh  ;
    }

    public void setDien_tich(double dien_tich) {
        Dien_tich = dien_tich;
    }

    public double getChu_vi() {
        return canh * 4;
    }

    public void setChu_vi(double chu_vi) {
        Chu_vi = chu_vi;
    }



    @Override
    public String toString() {

        super.toString();
        return "canh: " + canh + "Dien tich" + Dien_tich + "Chu vi: " + Chu_vi;
    }
}

