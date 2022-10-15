package Buoi_7_ArrayList.Thuc_hanh_2.controller;

import Buoi_7_ArrayList.Thuc_hanh_2.model.HodanModel;
import Buoi_7_ArrayList.Thuc_hanh_2.model.Member;
import Buoi_7_ArrayList.Thuc_hanh_2.model.MemberModel;
import Buoi_7_ArrayList.Thuc_hanh_2.model.hodan;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        MemberModel memberModel = new MemberModel();
        Member member= memberModel.inputMember();
        System.out.println(member.toString());


        Member member2= memberModel.inputMember();
        System.out.println(member.toString());

        ArrayList<Member> members = new ArrayList<>();
        members.add(member);
        members.add(member);
        HodanModel hodanModel = new HodanModel();
        hodan hodan = hodanModel.inputHodan();
        hodan.setMembers(members);
    }
}
