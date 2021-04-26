package session9;

public class TestMonster {

    public static void main(String[] args) {

        Monster M = new Monster("Lion King");
        FireMonster FM = new FireMonster("Dai bang lua");
        WaterMonster WM = new WaterMonster("Bach tuoc khong lo");
        StoneMonster SM = new StoneMonster("Pikachu:))");

        System.out.println(M.attack());
        System.out.println(FM.attack());
        System.out.println(WM.attack());
        System.out.println(SM.attack());

        FM = new FireMonster("Lon lua");
        System.out.println(FM.attack());
    }
}
