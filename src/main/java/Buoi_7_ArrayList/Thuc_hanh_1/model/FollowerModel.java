package Buoi_7_ArrayList.Thuc_hanh_1.model;

import java.util.Scanner;

public class FollowerModel {
    public Follower inputFllower(){
        Follower follower = new Follower();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên người theo dõi: ");
        String name = input.nextLine();
        System.out.println("Nhập id người theo dõi: ");
        int id = input.nextInt();
        System.out.println("Nhập email người theo dõi: ");
        input.nextLine();
        String email = input.nextLine();
        System.out.println("Số lượng người thích: ");
        int numberOfLike = input.nextInt();
        input.nextLine();
        follower.setName(name);
        follower.setId(id);
        follower.setEmail(email);
        follower.setNumberOfLike(numberOfLike);
        return follower;
    }
}
