package entity;

/**
 * Created by java on 16.06.2017.
 */
public class PC {
    private User owner;
    private String HDD;
    private int ram;

    public PC() {
    }

    public PC(User owner, String HDD, int ram) {
        this.owner = owner;
        this.HDD = HDD;
        this.ram = ram;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "owner='" + owner + '\'' +
                ", HDD='" + HDD + '\'' +
                ", ram=" + ram +
                '}';
    }
}
