package BTVN_Quan_ly_lop_hoc.Model;

import java.util.ArrayList;

public class Grade_block {
    private String lop;
    private int Course;
    private int semester;
    private ArrayList<School> schools = new ArrayList<>();

    public  Grade_block (){
    }

    public Grade_block(String lop, int course, int semester, ArrayList<School> schools) {
        this.lop = lop;
        this.Course = course;
        this.semester = semester;
        this.schools = schools;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course) {
        Course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<School> schools) {
        this.schools = schools;
    }

    @Override
    public String toString() {
        return "Grade_block{" +
                "lop='" + lop + '\'' +
                ", Course=" + Course +
                ", semester=" + semester +
                ", schools=" + schools +
                '}';
    }
}
