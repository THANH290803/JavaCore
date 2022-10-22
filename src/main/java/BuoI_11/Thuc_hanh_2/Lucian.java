package BuoI_11.Thuc_hanh_2;

public class Lucian implements CanShoot,CanSurf{
    private String hair;
    private String weapon_pistols;

    public Lucian(String hair, String weapon_pistols) {
        this.hair = hair;
        this.weapon_pistols = weapon_pistols;
    }

    @Override
    public String toString() {
        return "Lucian{" +
                "hair='" + hair + '\'' +
                ", weapon_pistols='" + weapon_pistols + '\'' +
                '}';
    }

    @Override
    public void shoot() {
        System.out.println(toString());
    }

    @Override
    public void surf() {
        System.out.println(toString());
    }
}
