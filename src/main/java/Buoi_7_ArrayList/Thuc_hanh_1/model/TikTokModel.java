package Buoi_7_ArrayList.Thuc_hanh_1.model;

import java.util.ArrayList;

public class TikTokModel {
    public TikTok inputTikTok(){
        TikTok tiktok = new TikTok();
        SongModel songModel = new SongModel();
        IdolModel idolModel = new IdolModel();
        System.out.println("Nhập bài hát đầu tiên: ");
        Song song = songModel.inputSong();
        System.out.println("Nhập bài hát thứ hai: ");
        Song song2 = songModel.inputSong();
        System.out.println("Nhập thần tượng đầu tiên: ");
        idolModel.inputIdol();
        Idol idol = idolModel.inputIdol();
        System.out.println("Nhập thần tượng thứ hai: ");
        idolModel.inputIdol();
        Idol idol2 = idolModel.inputIdol();

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song2);
        tiktok.setSongs(songs);

        ArrayList<Idol>idols = new ArrayList<>();
        idols.add(idol);
        idols.add(idol2);
        tiktok.setIdols(idols);
        return  tiktok;
    }
}
