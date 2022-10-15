package Buoi_7_ArrayList.Thuc_hanh_1.model;

import java.util.ArrayList;

public class Idol {
    private String name;
    private int id;
    private String email;
    private ArrayList<Follower> followers;
    private String group;

    public Idol(){
    }

    public Idol(String name, int id, String email,String group, ArrayList<Follower> followers){
        this.id = id;
        this.name = name;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
