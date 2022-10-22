package KiemTra2.Model;


import java.util.Scanner;

public class LoginModel {
    public Login inputLogin(){
        Login login = new Login();
        Scanner input = new Scanner(System.in);
        System.out.println("Input username: ");
        String userName = input.nextLine();
        System.out.println("Input passwork: ");
        String PassWork = input.nextLine();
        return login;
    }
}
