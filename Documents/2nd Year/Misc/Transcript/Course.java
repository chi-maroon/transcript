import java.util.ArrayList;
public class Course{
    private ArrayList<Assignment> assignments;
    private String name;
    private double credits;
    public Course(String theName){
        this.assignments = new ArrayList<Assignment>();
        this.name = theName;
        this.credits = 3.0;
    }
    public Course(String theName, double theCredits){
        this.assignments = new ArrayList<Assignment>();
        this.name = theName;
        this.credits = theCredits;
    }
}