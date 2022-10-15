package Buoi_7_ArrayList.Thuc_hanh_2.model;

import java.util.ArrayList;

public class hodan {
    private int id;
    private String numberHouse;
    private String Number_of_member;
    private ArrayList<Member> members;

    public hodan() {
    }

    public hodan(int id, String numberHouse, String Number_of_member, ArrayList<Member> members) {
        this.id = id;
        this.numberHouse = numberHouse;
        this.Number_of_member = Number_of_member;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getNumber_of_member() {
        return Number_of_member;
    }

    public void setNumber_of_member(String number_of_member) {
        Number_of_member = number_of_member;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

}
