package BuoI_11.Thuc_hanh_2;

public class Yasuo implements CanSurf{
    private String hair;
    private String weapon_sword;

    public Yasuo(String hair, String weapon_sword) {
        this.hair = hair;
        this.weapon_sword = weapon_sword;
    }

    @Override
    public String toString() {
        return "Yasuo{" +
                "hair='" + hair + '\'' +
                ", weapon_sword='" + weapon_sword + '\'' +
                '}';
    }

    @Override
    public void surf() {
        System.out.println(toString());
    }
}
