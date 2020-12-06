package pattern.strategy.adventure;

public class King extends Character{
    public King(){
     weaponBehaviour=new SwordBehaviour();
    }

    @Override
    void display() {
        System.out.println("Am king");
    }
}
