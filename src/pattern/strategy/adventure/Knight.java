package pattern.strategy.adventure;

public class Knight  extends Character{
    @Override
    void display() {
        System.out.println("am Knight");
    }
    Knight(){
        weaponBehaviour=new AxeBehaviour();
    }
}
