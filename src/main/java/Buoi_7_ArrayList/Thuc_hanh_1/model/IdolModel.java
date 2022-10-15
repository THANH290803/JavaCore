package Buoi_7_ArrayList.Thuc_hanh_1.model;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolModel {
    public Idol inputIdol(){
        Idol idol = new Idol();
        FollowerModel followerModel = new FollowerModel();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên thần tượng: ");
        String name = input.nextLine();
        System.out.println("Nhập id thần tượng: ");
        int id = input.nextInt();
        System.out.println("Nhập email thần tượng: ");
        input.nextLine();
        String email = input.nextLine();
        System.out.println("Nhập nhóm: ");
        String group = input.nextLine();
        System.out.println("Người theo dõi đầu tiên: ");
        Follower follower = followerModel.inputFllower();
        System.out.println("Người theo dõi thứ hai: ");
        Follower follower1 = followerModel.inputFllower();

        idol.setName(name);
        idol.setId(id);
        idol.setEmail(email);
        idol.setGroup(group);

        ArrayList<Follower> followers = new ArrayList<>();
        followers.add(follower);
        followers.add(follower1);
        idol.setFollowers(followers);
        return idol;
    }
}
