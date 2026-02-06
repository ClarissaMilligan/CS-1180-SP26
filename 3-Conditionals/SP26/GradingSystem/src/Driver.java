import java.util.*;

public class Driver {
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




















// import java.util.ArrayList;

// public class Driver {
//     public static void main(String[] args){


//         // Box<String> b1 = new Box<String>("asdfasdf");


//         // Box<Integer> b2 = new Box<Integer>(5);


//         Box<Integer> b3 = new Box<Integer>(4);


//         Box<Salad> b4 = new Box<Salad>(new Salad());


//         // ArrayList<? extends Integer> l1 = new ArrayList<>();

//         // l1.add(5);


//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(3);
//         list.add(3);
//         list.add(3);
//         list.add(3);
//         list.add(3);

//         printItems(list);


//         ArrayList<? super Number> l2 = new ArrayList<>();
//         l2.add(4.0);

//         l2.get(0);


//     }

//     public static void printItems(ArrayList<? extends Integer> printME){
//         for(int i = 0; i < printME.size(); i ++){
//             System.out.println(printME.get(i));
//         }
//     }
// }