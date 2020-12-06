package pattern.strategy.adventure;

public class AdventureStart {
    public static void main(String[] args) {
        System.out.println("Game Start");
        Character c1=new King();
        c1.display();
        c1.performAction();

        Character c2=new Knight();
        c2.display();
        c2.performAction();
        c2.setWeaponBehaviour(new KnifeBehaviour());
        c2.performAction();
    }
}
