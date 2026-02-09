import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {

        String user;

        user = "Reese";
        


        // while(true){
        //     System.out.println("hello " + user);
        // }

        int timesLooped = 0;

        // everytime timesLooped < 5 == true => run the loop again
        while(timesLooped < 5) {
            System.out.println("hello " + user);

            timesLooped += 1;
            // jump back to top
            // re-check that conditional
        }


        boolean shouldRun = false;
        // never runs
        while(shouldRun){
            System.out.println("world");
        }


        if(true){
            int i = 5;
            System.out.println(i);
            System.out.println(shouldRun);
            // i can be accessed here
            if(i == 5){
                System.out.println("I was 5 " + i);
            }
        }

        //  but i cannot be accessed over here
        // System.out.println(i);


        // Scanner scnr = new Scanner(System.in);

        // String givenName = scnr.nextLine();

        // while(givenName.equals("Reese")){
        //     // run infinitely if conditional was true
        //     System.out.println("You are named reese");
        // }



        // int counter = 10;


        // // this does NOT print 0
        // while(counter > 0){
        //     System.out.println("Counter: " + counter);

        //     counter = counter - 1;
        // }



        int counter = 10;


        // this DOES print 0
        while(counter >= 0){
            System.out.println("Counter: " + counter);

            counter = counter - 1;
        }


        int loopVar = 1;
        // consider when i = 6
        // the code never runs
        // bc 6 < 6 => false
        // while(i <= 6){
        // 5 <= 5 => true
        while(loopVar <= 5){
            System.out.println(loopVar);

            loopVar ++;
        }

        // while loop:
        // first evaluate a conditional
        // then we execute code

        System.out.println();
        System.out.println();
        System.out.println();



        int count = 0;
        // do while => code execute before conditional check
        // always runs AT LEAST once
        do {
            System.out.println("hello");
            System.out.println(count);

            count++;
        } while(count < 17);

        // if you ever KNOW how many times your loop should run
        // reaching for a FOR loop

        // declaration; conditional; modification
        for(int i = 0; i < 10; i++){
            System.out.println("This is a for loop");

            // i is scoped within {}s
            System.out.println(i);
        }
        // i is NOT available down here

        // System.out.println(i);
        System.out.println();
        System.out.println();
        System.out.println();


        // for(int i = 5; i < 10; i++){
        //     System.out.println("This is a for loop");
            
        //     // i is scoped within {}s
        //     System.out.println(i);
        // }


        
        // print all odds between 11 - 103
        // for(int i = 11; i <= 103; i += 2){
        //     System.out.println(i);
        // }

        System.out.println();
        System.out.println();
        System.out.println();

        for(int i = 0; i <= 103; i += 1){

            if(i >= 11){
                if(i % 2 == 1){
                    System.out.println(i);
                }

            }

        }

        // HELP ROOM: 367 Joshi

    }
}
