package Buoi_6_OOP.Thuc_hanh_2;

public class SinhVienBiz extends SinhVienTechMaster{
    public double diemMarketing;
    public double diemSales;


    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Điểm marketing: " + getDiemMarketing());
        System.out.println("Điểm Sales: " + getDiemSales());
        System.out.println("Diem trung binh: " + getDiem());
        System.out.println("Hoc luc: " + gethocLuc());
    }
}
