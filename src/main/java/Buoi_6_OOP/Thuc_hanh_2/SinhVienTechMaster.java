package Buoi_6_OOP.Thuc_hanh_2;

public abstract class SinhVienTechMaster {
    public String ho_ten;
    public String nganh;

    public double diem;

    public SinhVienTechMaster() {
    }

    public SinhVienTechMaster(String ho_ten, String nganh) {
        this.ho_ten = ho_ten;
        this.nganh = nganh;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }


    public abstract double getDiem();

    public String gethocLuc() {
        if (getDiem() < 5) {
            return "Yeu";
        } else if (getDiem() < 6.5 || getDiem() <= 5) {
            return "Trung Binh";
        } else if (getDiem() <= 6.5 || getDiem() < 7.5) {
            return "Kha";
        } else if (getDiem() <= 7.5 || getDiem() <= 10){
            return "Gioi";
        } else {
            return "Nhap sai";
        }
    }

        public void show() {
            System.out.println("Ho ten: " + getHo_ten());
            System.out.println("Nganh: " + getNganh());
    }
}

