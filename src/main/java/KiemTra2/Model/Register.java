package KiemTra2.Model;

public class Register {
    String userName;
    String email;
    String PassWork;

    public Register(){
    }

    public Register(String userName, String email, String PassWork){
        this.userName = userName;
        this.email = email;
        this.PassWork = PassWork;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWork() {
        return PassWork;
    }

    public void setPassWork(String passWork) {
        PassWork = passWork;
    }

    @Override
    public String toString() {
        return "Register{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", PassWork='" + PassWork + '\'' +
                '}';
    }
}
