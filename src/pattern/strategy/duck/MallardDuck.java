package pattern.strategy.duck;

public class MallardDuck extends Duck {

    public MallardDuck(){
      quackableBehaviour=new Quack();
      flyableBehaviour=new FlyWithWings();
  }

    @Override
    public void Display() {
        System.out.println("Am Own Mallard Duck Display");
    }

}
