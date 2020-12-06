package pattern.observer.newspaper;

import java.util.ArrayList;

interface Observer{
    void newsUpdate(String time,String news);
}

interface Subject{
    void addUser(Observer o);
    void removeUser(Observer o);
    void notifyUser();
}

public interface users {
    void getMagazine();
}

//complete data present here
class Magazines implements Subject{
    public ArrayList observers;
    public String news;
    public String time;

    Magazines(){
        observers=new ArrayList();
    }

    @Override
    public void addUser(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeUser(Observer o) {
        int i=observers.indexOf(o);
        if(i>=1 ){
            observers.remove(i);
        }
    }

    @Override
    public void notifyUser() {
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer)observers.get(i);
            observer.newsUpdate(time,news);
        }
    }

    public void setNews(String time,String news){
        this.time=time;
        this.news=news;
        notifyUser();
    }
}

class MagazineCompany{
    public static void main(String[] args) {
        System.out.println("Company Stated Publishing Magazine's");
        Magazines magazines=new Magazines();
        int day=1;
        User u1=new User(magazines);
        User u2=new User(magazines);
        User u3=new User(magazines);
        User u4=new User(magazines);
        User u5=new User(magazines);
        User u6=new User(magazines);
        User u7=new User(magazines);
        magazines.setNews("Day "+day++,"??????????? news repoted ????????????");
        day=2;
        magazines.setNews("Day "+day++,"??????????? news repoted ????????????");




    }
}

class User implements Observer{
    private Subject magazineDta;
    @Override
    public void newsUpdate(String time, String news) {
        System.out.println(time+"   "+news);
    }
    User(Subject magazineDta){
        this.magazineDta=magazineDta;
        magazineDta.addUser(this);
    }
}

