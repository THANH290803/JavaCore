package Buoi_12.Lap5.Controller;

import Buoi_12.Lap5.Model.Pet;
import Buoi_12.Lap5.Model.PetModel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PetModel petModel = new PetModel();
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random rd = new Random();

        boolean check = true;


        System.out.println("Nhap so luong pet");
        int number = input.nextInt();
        petModel.inputPetRandom(input,number,pets);

        System.out.println(pets);


        System.out.println("Nhap pet cua ban: ");
        Pet mpet = petModel.inputPet(input);
        System.out.println( " pet: " + mpet);

        int checkMatch = 0;
        int count = 0;
        do {
            int rdNumber = rd.nextInt(pets.size());
            Pet pet = pets.get(rdNumber);
            count++ ;
            if (pet.getType().equals(pet.getType())
                    && !(pet.getGerder().equals(pet.getGerder()))){
                System.out.println("Matching: " + pet);
                checkMatch++;
                System.out.println("do you want to continues y/ n");
                String checkYN = input.nextLine();
                if (checkYN.equalsIgnoreCase("y")){
                    check = true;
                } else {
                    check = false;
                }
            }



            if (count == 100 && checkMatch == 0){
                System.out.println("No match");
                check = false;
            }
        } while (check);
        System.out.println("Exit");
    }
}
