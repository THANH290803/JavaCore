package KiemTra2.Model;

public class Login {
    String userName;
    String PassWork;

    public Login(){
    }

    public Login(String userName, String PassWork){
        this.userName = userName;
        this.PassWork = PassWork;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWork() {
        return PassWork;
    }

    public void setPassWork(String passWork) {
        PassWork = passWork;
    }

    @Override
    public String toString() {
        return "Login{" +
                "userName='" + userName + '\'' +
                ", PassWork='" + PassWork + '\'' +
                '}';
    }
}
