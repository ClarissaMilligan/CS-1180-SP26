import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // when to use for
        //      when you DO know how many times youre going to loop
        // when to use while
        //      when you DONT know how many times youre going to loop
    
        // initialize; while i < 10; i++
        for(int i = 5; i < 10; i++){
            System.out.println("number: " + i);
        }


        // int j;

        // infinite loop
        // for(j = 0; j < 5; j = j - 1){
        //     System.out.println("J was " + j);
        // }


        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Give me a number between 0 and 10");
        Scanner scnr = new Scanner(System.in);

        // scnr.nextInt()
        boolean isValid = false;
        int input = 0;

        // input sanitization
        while(!isValid){

            input = scnr.nextInt();

            if(input < 10 && input > 0){
                isValid = true;


                // dont write the entire rest of program
                System.out.println("That was good input");
            }
            else {
                System.out.println("Error: bad input");
            }
        }

        input = input + 5;


        // System.out.println("got here");



        System.out.println("Input plus five was " + input);

        for(int i = 0; i < 100; i++){

            if(i == 48){
                continue;
            }
            if(i == 4){
                continue;
            }

            System.out.println(i);
            
            if(i == 50){
                break;
            }
        }

        System.out.println("Finished running loop");


        // KISS
        // Keep it simple stupid


        for(double decimal = 0.0; decimal < 1.0; decimal += 0.1){
            System.out.println(decimal);
        }


        // for(int i = 0; i < 10; i++){

        //     for(int j = 0; j < 10; j++){
        //         System.out.println("ran");
        //     }
        //     System.out.println("resetting j");


        // }



        // for(int i = 0; i < 10; i++){

        //     for(int j = 0; j < 25; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");


        // }


        // i value controls how far down
        for(int i = 0; i < 10; i++){

            // j control how far across you are
            for(int j = 0; j < 25; j++){
                // i and j are effectively coordinates

                if(i == 3 && j == 3){
                    System.out.print("? ");
                }
                else if(i == 0){
                    System.out.print("? ");
                }
                else if(j == 24){
                    System.out.print("? ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");


        }


        
    }
}