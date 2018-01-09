import javax.print.event.PrintJobListener;

class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Projects("Zach", "I am a web developer", 13.50);
        System.out.println(project1.elevatorPitch());
        Project project2 = new Projects("John", "I am a Boss", 130.50);
        System.out.println(project2.elevatorPitch());
        Project project3 = new Projects("Jeff", "I am a Waiter", 7.50);
        System.out.println(project3.elevatorPitch());

    }
 
}