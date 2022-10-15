package Buoi_7_ArrayList.Thuc_hanh_1.model;

import java.util.Scanner;

public class SongModel {
    public Song inputSong(){
        Song song = new Song();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id bài hát: ");
        int id = input.nextInt();
        System.out.println("Nhập tên bài hát: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Nhập tên ca sĩ: ");
        String singer = input.nextLine();
        song.setId(id);
        song.setName(name);
        song.setSinger(singer);
        return song;
    }
}
