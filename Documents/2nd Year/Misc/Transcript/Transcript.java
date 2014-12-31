import java.util.ArrayList;
import java.util.Scanner;
public class Transcript{
    private ArrayList<Term> terms;
    private Term currentTerm;
    private Transcript(String filename){
        this.terms = generateTranscript(filename);
        this.currentTerm = null;
    }
    
    private static ArrayList<Term> generateTranscript(String filename){
        ArrayList<Term> a = new ArrayList<Term>();
        return a;
    }
    
    public static void main(String[] args){
        String filename = new String();
        if(args.length != 0)
            filename = args[0];
        else
            filename = "transcript.txt";
        System.out.print("Welcome to the Transcript Program! \n Currently loading data ... \n \n");
        Transcript transcript = new Transcript(filename);
        System.out.println("Data is now loaded");
        transcript.shell();
    }
    public void shell(){
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        while(true){
            System.out.print("Choose an option by typing in the number of the choice:\n 1:Edit or view terms\n 2: Add a new term\n");
            System.out.print("3:Print a transcript\n 4:Save\n > ");
            try{
                choice = Integer.parseInt(scan.nextLine());
            }
            catch(NumberFormatException f){
                System.out.println("Invalid Selection");
                continue;
            }
            switch(choice){
                
                case 1: this.terms_shell();
                break;
                
                case 2: this.add_new_term();
                break;
                
                case 3: this.print();
                break;
                
                case 4: this.save();
                
                default: System.out.println("Invalid Selection");
                break;
            }
        }
            
    }
    private void terms_shell(){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Choose an option below: \n 1: Go back \n");
        for(int i=0;i<terms.size();i++)
        {
            int placeholder = i+2;
            System.out.println(placeholder+": Go to "+this.terms.get(i).get_date());
        }
        int choice = -1;
        while(choice == -1){
            System.out.print("> ");
            try{
                choice = Integer.parseInt(scan.nextLine());
            }
            catch(NumberFormatException f){
                System.out.println("Unacceptable Response, try again");
                continue;
            }
            if(choice<1 || choice > (1+terms.size())){
                System.out.println("Unacceptable Response, try again");
                choice = -1;
                continue;
            }
        }
        if(choice ==1)
            return;
        this.course_shell(choice-2);
    }
    private void course_shell(int theTerm){}
    private void add_new_term(){System.out.println();}
    private void print(){System.out.println();}
    private void save(){System.out.println();}
}