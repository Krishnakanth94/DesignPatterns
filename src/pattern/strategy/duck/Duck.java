package pattern.strategy.duck;
//divided the non static and often changing
interface FlyableBehaviour {
    void fly();
}
interface QuackableBehaviour {
    void quack();
}
//---------
class FlyLikeRocket implements  FlyableBehaviour{

    @Override
    public void fly() {
        System.out.println("AM now flying like a rocket");
    }
}

class FlyWithWings implements FlyableBehaviour {

    @Override
    public void fly() {
        System.out.println("AM FLY WITH WINGS");
    }
}

class FlyNoWay implements FlyableBehaviour {

    @Override
    public void fly() {
        System.out.println("NO FLY");
    }
}

class Quack implements QuackableBehaviour{

    @Override
    public void quack() {
        System.out.println("am quacking duck");
    }
}
class Squeak implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("am sequking duck");
    }
}
class MuteQuack implements QuackableBehaviour{
    @Override
    public void quack() {
        System.out.println("am mute");
    }
}

public abstract class Duck{
  FlyableBehaviour flyableBehaviour;
  QuackableBehaviour quackableBehaviour;

    public FlyableBehaviour getFlyableBehaviour() {
        return flyableBehaviour;
    }

    public void setFlyableBehaviour(FlyableBehaviour flyableBehaviour) {
        this.flyableBehaviour = flyableBehaviour;
    }

    public QuackableBehaviour getQuackableBehaviour() {
        return quackableBehaviour;
    }

    public void setQuackableBehaviour(QuackableBehaviour quackableBehaviour) {
        this.quackableBehaviour = quackableBehaviour;
    }

  public Duck(){}
  public abstract void Display();
  public void performFly(){
      flyableBehaviour.fly();
  }
  public void swim(){
      System.out.println("All DUCKS CAN SWIM");
  }
  public void performQuack(){
      quackableBehaviour.quack();
  }
}





