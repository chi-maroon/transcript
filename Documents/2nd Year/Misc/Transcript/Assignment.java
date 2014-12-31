import java.util.ArrayList;
public class Assignment{
    private double weight;
    private double score;
    private String name;
    
    public Assignment(String theName, double theScore, double theWeight){
        this.name = theName;
        this.score = theScore;
        this.weight = theWeight;
    }
    
    public Assignment(String theName,double theWeight){
        this.name = theName;
        this.score = 0.0;
        this.weight = theWeight;
    }
}