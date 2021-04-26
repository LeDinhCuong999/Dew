package session9;

public class StoneMonster extends Monster{

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Stone monster:" + " " + getName();
    }
}
