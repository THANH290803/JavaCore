package Buoi_12.Lap5.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class PetModel {




    public Pet inputPet(Scanner input){
        Pet pet = new Pet();
        System.out.println("Nhap ten: ");
        input.nextLine();
        String name = input.nextLine();
        pet.setName(name);
        System.out.println("Nhap loai");
        String species = input.nextLine();
        pet.setSpecies(species);
        System.out.println("Nhap tuoi");
        int age = input.nextInt();
        pet.setAge(age);
        System.out.println("Nhập Type");
        System.out.println("1. CAT" + "\n 2.DOG");
        int type = Integer.parseInt(input.nextLine());
        switch (type) {
            case 1:
                TYPE type1 = TYPE.CAT;
                break;
            case 2:
                TYPE type2 = TYPE.DOG;
                break;
        }
        System.out.println("mô tả: ");
        String description = input.nextLine();
        pet.setDescription(description);
        System.out.println("image: ");
        String image = input.nextLine();
        pet.setImages(image);
        pet.setIdPet(Pet.getId());
        return pet;
    }



    public void inputPetRandom(Scanner sc, int number , ArrayList<Pet> pets){
        for (int i = 0 ; i < number ; i++) {

            Pet pet = new Pet();
            String name = Integer.toString(i);
            pet.setName(name);
            String species = Integer.toString(i);
            pet.setSpecies(species);
            int rdNumber = (int)(Math.random()*100)%5 +1;
            int age = rdNumber;
            pet.setAge(age);
            rdNumber = (int)(Math.random()*100)%2;
            int choose = rdNumber;
            switch (choose){
                case 1:
                    TYPE type1 = TYPE.CAT;
                    break;
                case 2:
                    TYPE type2 = TYPE.DOG;
                    break;
            }
            String description = Integer.toString(i);
            pet.setDescription(description);

            String image = Integer.toString(i);
            pet.setImages(image);
            pet.setIdPet(Pet.getId());

            pets.add(pet);
        }
    }
}
