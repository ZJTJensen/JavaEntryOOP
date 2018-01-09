public class Greeter {
    public String greet(String name){
        return createGreeting(name);
    }
    public String greet(){
        return createGreeting("World");
    }
    public String greet(String fName, String lName){
        return createGreeting(fName + " " + lName);
    }
    private String createGreeting(String toBeGreeted){
        return "Hello " + toBeGreeted;
    }
}