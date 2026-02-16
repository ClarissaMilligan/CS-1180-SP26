import java.util.*;

public class Grader {
    public static void main(String[] args) {
        

        
        // out of 22 points
        
        // get some form of percentage
        
        // do some conditional logic based on that percent
        
        
        
        // read in some data 
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter number of points:");
        int points = scnr.nextInt();

        // clearing the newline from the scanner
        scnr.nextLine();
        
        System.out.println("Enter your name:");
        String name = scnr.nextLine();
        
        System.out.println("Name: " + name);
        System.out.println("Points entered: " + points);



        // eliminate "magic numbers"
        double totalQuizPoints = 22.0;

        double percent = points / totalQuizPoints;

        System.out.println("Percent: " + percent);


        if(percent > 0.90){
            System.out.println("You got an A!");
        }
        else if(percent > 0.80){
            System.out.println("You got a B!");
        }
        else if(percent > 0.70){
            System.out.println("You got a C!");
        }
        else if(percent > 0.60){
            System.out.println("You got a D!");
        }
        else {
            System.out.println("You got an F!");

            // when you comparing strings
            // if(name == "Reese")

            if(name.equalsIgnoreCase("Reese") || name.equalsIgnoreCase("Clarissa")){
                System.out.println("You pass the class");
            }
            else {
                System.out.println("You failed the class");
            }

        }






        // if(percent > 0.80 && percent <= 0.90){
        //     System.out.println("You got a B!");
        // } 






        System.out.println("Ending grading program...");
    }
}



















