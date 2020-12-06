package pattern.strategy.duck;

public class RubberDuck extends Duck {
    public RubberDuck(){
        quackableBehaviour=new MuteQuack();
        flyableBehaviour=new FlyNoWay();
    }

    @Override
    public void Display() {
        System.out.println("Am Own Rubber Duck Display");
    }

    public static void main(String[] args) {
        System.out.println("RUBBER DUCK");
    }
}
