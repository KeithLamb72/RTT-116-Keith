package M303_5;


public class WhileLoop {


    public static void main(String[] args) {

        //this would create a Infinite Loop
        // while (true) {
        //    System.out.println("Inside while loop !");
        // }

        //while Loops have some condition
        String word = "abcdefg";
        int pos = 0;
        while (pos < word.length()) {
            pos = pos + 1;
            System.out.print("Inside while loop ");
        }

        while (true) {
            System.out.println("Inside while condition true");
        }
       // boolean c = true;
        //while (c) {
            //this code can never execute because the conditions on the while loop will
            //get checked and not enter the code
     //       System.out.println("Inside while condition false");
     //   }
        //Great Example for While Loops
      //  boolean success = false;
       // while (!success) {
            //make an api call attempt
            //if ( apicall = true ) {
            //   success = true;
            /// }
        }

        // DO WHILE
     //   int x = 5;
   //     do{
    //        System.out.println("Inside do while");
   //     } while (x < 5);
 //   }
}
