package Buoi_6_OOP.Thuc_hanh_2;

public class SinhVienIT extends SinhVienTechMaster{
    public double diemJava;
    public double diemHtml;
    public double diemCss;


    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml +diemCss)/ 4;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Diem Java: " + getDiemJava());
        System.out.println("Diem HTML: " + getDiemHtml());
        System.out.println("Diem CSS: " + getDiemCss());
        System.out.println("Diem trung binh: " + getDiem());
        System.out.println("Hoc luc: " + gethocLuc());
    }
}
