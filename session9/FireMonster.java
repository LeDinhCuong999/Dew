package session9;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    @Override

    public String attack() {
        return "Fire monster:" + " " + getName();
    }
}
