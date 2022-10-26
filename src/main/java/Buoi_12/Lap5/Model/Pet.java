package Buoi_12.Lap5.Model;

public class Pet {
    private static int id = 1;
    private int idPet;
    private String name;
    private String species;
    private int age;

    private String gerder;

    private TYPE type;

    public enum TYPE {
        DOG, CAT
    }
    private String description;
    private String images;

    public Pet(){}

    public Pet(int idPet, String name, String species, int age, String gerder, TYPE type, String description, String images) {
        this.idPet = idPet;
        this.name = name;
        this.species = species;
        this.age = age;
        this.gerder = gerder;
        this.type = type;
        this.description = description;
        this.images = images;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Pet.id = id;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGerder() {
        return gerder;
    }

    public void setGerder(String gerder) {
        this.gerder = gerder;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "idPet=" + idPet +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", gerder='" + gerder + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
