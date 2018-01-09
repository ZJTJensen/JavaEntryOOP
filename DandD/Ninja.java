public class Ninja extends Human{
    public Ninja(){
        setStealth(getStealth()+7);
    }
    public void steal(Human man){
        int health = this.intel;
        man.setHealth(getHealth()-health);
        setHealth(getHealth()+health);
        System.out.println("You hit the target for " + intel + " health.");
        System.out.println("They now have " + man.getHealth() + " Health.");
        System.out.println("You heal for " + intel + " health.");
        System.out.println("You now have " + getHealth() + " Health.");
    }
}