public class Wizard extends Human{
    public Wizard(){
        setHealth(getHealth()-50);
        seIntel(geIntel()+5);
    }
    public void heal(Human man){
        int health = this.intel;
        man.setHealth(getHealth()+health);
        System.out.println("You heal the target " + intel + " health.");
        System.out.println("They now have " + man.getHealth() + " Health.");
    }
    public void attack(Human man){
        int damage = this.intel*3;
        man.setHealth(getHealth()-damage);
        System.out.println("You hit the enemy for " + damage + " Damage.");
        System.out.println("They now have " + man.getHealth() + " Health.");

    }
}