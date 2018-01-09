public class PortfolioTest {
    public static void main(String[] args) {
        Portfolio myPort = new Portfolio();
        Project project1 = new Project("Zach", "I am a web developer", 13.50);
        Project project2 = new Project("John", "I am a Boss", 130.50);
        Project project3 = new Project("Jeff", "I am a Waiter", 7.50);

        myPort.addProject(project1);
        myPort.addProject(project2);
        myPort.addProject(project3);
        System.out.println(myPort.getPortfolioCost());
        myPort.showPortfolio();
    }
 
}