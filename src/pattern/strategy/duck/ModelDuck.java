package pattern.strategy.duck;

public class ModelDuck extends Duck {
    @Override
    public void Display() {
        System.out.println("AM Model test Duck");
    }
    public ModelDuck(){
        quackableBehaviour=new Squeak();
        flyableBehaviour=new FlyNoWay();
    }
}
