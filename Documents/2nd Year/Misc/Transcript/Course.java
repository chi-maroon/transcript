import java.util.ArrayList;
public class Course{
    private ArrayList<Assignment> assignments;
    private String name;
    
    public Course(String theName){
        this.assignments = new ArrayList<Assignment>();
        this.name = theName;
    }
}