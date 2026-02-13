public class Driver {
    public static void main(String[] args){
        String s = "Reese Hatfield";

        // aside: string methods
        String name = "Reese";

        System.out.println(name.length());


        System.out.println(name.charAt(1));


        boolean b = name.contains("ees");
        System.out.println(b);


        // for(int i = 0; i < 10; i++){

        //     System.out.println("Start inner loop");
        //     for(int j = 0; j < 10; j++){
        //         System.out.println(j);
        //     }
        //     System.out.println("End inner loop");
        //     System.out.println();

        // }

        int triangleHeight = 10;

        // i = 2
        // for(int i = 0; i < triangleHeight; i ++){

        //     // j < i
        //     // print this dependent on what the size of i is
        //     for(int j = 0; j < i; j++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        for(int i = 0; i < triangleHeight; i++){

            // for(int j = 0; triangleHeight - j > 0; j++){
            //     System.out.print("* ");
            // }

            // inner loop never ran
            // j = 10
            // i = 0
            for(int j = triangleHeight; j > i; j-- ){
                // System.out.println("i =" + i);
                // System.out.println("j = " + j);

                System.out.print("* ");
            }

            System.out.println();
            
        }

        // multiplication table

        int tableSize = 35;

        for(int i = 1; i < tableSize + 1; i++){

            for(int j = 1; j < tableSize + 1; j++){
                // Syst em.out.print("(" + i + "," + j + ") ");

                // padding
                String result = (i * j) + "";

                // if(result.length() == 1){
                //     result = "0" + result;
                // }

                System.out.print(result + "\t");


            }

            System.out.println();
        }


        String ascii = " __      __       .__                                  __                                                   __               __    ________  \n" + //
                        "/  \\    /  \\ ____ |  |   ____  ____   _____   ____   _/  |_  ____     _____ ___.__. _____________  ____    |__| ____   _____/  |_  \\_____  \\ \n" + //
                        "\\   \\/\\/   // __ \\|  | _/ ___\\/  _ \\ /     \\_/ __ \\  \\   __\\/  _ \\   /     <   |  | \\____ \\_  __ \\/  _ \\   |  |/ __ \\_/ ___\\   __\\  /  ____/ \n" + //
                        " \\        /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/   |  | (  <_> ) |  Y Y  \\___  | |  |_> >  | \\(  <_> )  |  \\  ___/\\  \\___|  |   /       \\ \n" + //
                        "  \\__/\\  /  \\___  >____/\\___  >____/|__|_|  /\\___  >  |__|  \\____/  |__|_|  / ____| |   __/|__|   \\____/\\__|  |\\___  >\\___  >__|   \\_______ \\\n" + //
                        "       \\/       \\/          \\/            \\/     \\/                       \\/\\/      |__|               \\______|    \\/     \\/               \\/";

        System.out.println(ascii);


        // String text = "Reese";

        String text = "ReEs";

        boolean containsDuplicate = false;

        for(int i = 0; i < text.length(); i++){

            // System.out.println("Looking at char " + text.charAt(i));
            for(int j = 0; j < text.length(); j++){

                if(j == i){
                    continue;
                }

                if(text.charAt(i) == text.charAt(j)){

                    System.out.println("found duplicate " + text.charAt(i) + " and " + text.charAt(j));
                    containsDuplicate = true;
                }

                // System.out.println("comparing it char " + text.charAt(j));

            }


        }

        System.out.println("containsdupe: " + containsDuplicate);


    }
}