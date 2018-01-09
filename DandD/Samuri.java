public class Samuri extends Human{
    public static int numberOfSamuri = 0;
    public Ninja(){
        setHealth(getHealth()+100);
        numberOfSamuri++;
    }
    public void deathBlow(Human man){
        setHealth(getHealth()/2);
        man.setHealth(getHealth()-getHealth());
        System.out.println("You instantly kill the target");
        System.out.println("You now have " + getHealth() + " Health.");
    }
    public void meditate(){
        setHealth(getHealth()+(getHealth()/2));
        System.out.println("You now have " + getHealth() + " Health.");
    }
    public void howMany(){
        System.out.println("There are " + this.numberOfSamuri + " Samuri.");
    }
}