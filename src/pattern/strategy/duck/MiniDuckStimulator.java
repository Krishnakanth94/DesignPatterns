package pattern.strategy.duck;

public class MiniDuckStimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to my App");
        Duck d1=new MallardDuck();
        d1.performFly();
        d1.performQuack();

        Duck d2=new RubberDuck();
        d2.performFly();
        d2.performQuack();

        Duck d3=new RubberDuck();
        d3.performFly();
        d3.setFlyableBehaviour(new FlyLikeRocket());
        d3.performFly();
        d3.performQuack();
    }
}
