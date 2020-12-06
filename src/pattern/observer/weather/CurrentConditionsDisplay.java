package pattern.observer.weather;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    public float temperature;
    public float humidity;
    public Subject weatherData;


    @Override
    public void display() {
        System.out.println("Current Conditions :" + temperature+ " F degress and "+humidity+" % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
     this.temperature=temp;
     this.humidity=humidity;
     display();
    }

    public  CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
         weatherData.registerObserver(this);
    }
}
