package Buoi_7_ArrayList.Thuc_hanh_1.model;

import java.util.ArrayList;

public class TikTok {
    private ArrayList<Idol> idols;
    private ArrayList<Song> songs;

    public TikTok() {
    }

    public TikTok(ArrayList<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public ArrayList<Idol> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
