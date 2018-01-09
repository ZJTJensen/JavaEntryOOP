import java.util.ArrayList;
public class Portfolio{
    
       private ArrayList<Project> projects = new ArrayList<>();
    
       public void addProject(Project proj){
           this.projects.add(proj);
       }
//get all projects
       public ArrayList<Project> getProjects(){
           return this.projects;
       }

    public double getPortfolioCost(){
        double cost = 0;
        for(Project proj : this.projects){
            cost += proj.getInitialCost();
        }
        return cost;
    }

    public void showPortfolio(){
        System.out.println("Here are the pitches for the projects in this portfolio:");
        for(Project proj: this.projects){
            System.out.println(proj.elevatorPitch());
            // system
        }
    }
}