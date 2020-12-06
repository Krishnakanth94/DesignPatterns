package pattern.strategy.adventure;

//fight types
interface WeaponBehaviour{
    void  useWeapon();
}

//weapon data
class KnifeBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {
        System.out.println("Using Knife");
    }
}
class SwordBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("Using Sword");
    }
}
class AxeBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("Using Axe");
    }
}

public abstract class Character {
    WeaponBehaviour weaponBehaviour;
    public Character(){}
    abstract void display();

    public WeaponBehaviour getWeaponBehaviour() {
        return weaponBehaviour;
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void performAction(){
        weaponBehaviour.useWeapon();
    }
}
