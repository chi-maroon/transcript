import java.util.ArrayList;
public class Term{
    private ArrayList<Course> courses;
    private String date;
    
    public Term(String theDate){
        this.date = theDate;
        this.courses = new ArrayList<Course>();
    }
    
    public String get_date(){
        return this.date;
    }
}