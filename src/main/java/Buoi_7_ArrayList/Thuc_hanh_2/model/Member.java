package Buoi_7_ArrayList.Thuc_hanh_2.model;

public class Member {
    private String fullname;
    private String job;
    private String dob;

    public Member() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Member{" +
                "fullname='" + fullname + '\'' +
                ", job='" + job + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
