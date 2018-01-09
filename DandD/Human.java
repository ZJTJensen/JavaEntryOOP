public class Human{
    private int health = 100;
    private int str = 3;
    private int stealth = 3;
    private int intel = 3;

    public void attack(Human man){
        int damage = this.str;
        man.setHealth(getHealth()-damage);
        System.out.println("You hit the enemy for " + str + " Damage.");
        System.out.println("They now have " + man.getHealth() + " Health.");

    }

	/**
	 * @return the intel
	 */
	public int getIntel() {
		return intel;
	}

	/**
	 * @param intel the intel to set
	 */
	public void setIntel(int intel) {
		this.intel = intel;
	}

	/**
	 * @return the stealth
	 */
	public int getStealth() {
		return stealth;
	}

	/**
	 * @param stealth the stealth to set
	 */
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
}