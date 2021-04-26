package session9;

public class Monster {

    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String attack() {
        return "King monster:" + " " + getName();
    }

}
