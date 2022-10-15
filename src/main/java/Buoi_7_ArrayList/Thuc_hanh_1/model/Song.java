package Buoi_7_ArrayList.Thuc_hanh_1.model;

public class Song {
    private String name;
    private int id;
    private String singer;

    public Song(){
    }

    public Song(String name, int id, String singer){
        this.id = id;
        this.name = name;
        this.singer = singer;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", singer='" + singer + '\'' +
                '}';
    }
}
