package Quan_ly_phone.view;

import Quan_ly_phone.model.*;

import java.util.Scanner;



public class Menu {
    public static void Menu() {
        System.out.println("--------------------------Menu-------------------");
        System.out.println("1---------------Add phone--------------------");
        System.out.println("2-----------Edit phone by IMEI-------------");
        System.out.println("3----------Delete phone by IMEI------------");
        System.out.println("4----------Sort by release_date------------");
        System.out.println("5-------------Sort by price-----------------");
        System.out.println("6---------Filter phones by release date----------");
        System.out.println("7--------Filter phones by price-------------------");
        System.out.println("8-----------------Show----------------------------");
        System.out.println("0-----------------Exit----------------------------");
        int Choose;
        System.out.println("enter the option : ");
        Scanner input = new Scanner(System.in);
        Choose = input.nextInt();
        switch (Choose) {
            case 1:
                AddPhone.AddNewPhoneName();
                break;
            case 2:
                EditPhone.Editphone();
                break;
            case 3:
                DeletePhone.Deletephone();
                break;
            case 4:
                SortByRelease_date.Sortbyrelease();
                break;
            case 5:
                Sortbyprice.Sortbyprice();
                break;
            case 6:
                filterphonesbyreleasedate.filterphonesbyreleasedate();
                break;
            case 7:
                filterphonesbyprice.filterphonesbyprice();
                break;
            case 8:
                Show.Show();
                break;
            case 0:
                Exit.Exit();
                break;
        }
    }
}
