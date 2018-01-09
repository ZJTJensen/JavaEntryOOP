public class Animal{
    private int limbs;
    private int legs;
    private String name;
    private String species;
    private boolean gender;

    public Animal(int limbs, int legs, String name, String species, boolean gender){
        //use setter ad getter without specific methods
        this.limbs=limbs;
        this.legs = legs;
        this.name = name;
        this.species = species;
        this. gender = gender;
        
    }


    public void setLimbs(int limbs){
        this.limbs = limbs;
    }

    public int getLimbs(){
        return limbs;
    }

    public static void main(){
        Animal cat= new Animal();
        cat.setLimbs(4);

        System.out.println( cat.getLimbs() );
    }
}