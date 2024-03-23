import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Customer {
 
    // logic for client with multiple accounts

    // ArrayList with all the client's accounts

    // login details required, username & password


    public void processRequest(BufferedReader in, PrintWriter out){
        out.println("Main Menu\nChoose from one of the following options:");
        out.println(1 + "Log a transaction");
        out.println(2 + "View remaining allowance"); // NOT ALLOWANCE, WORD FOR MONEY SPENDING
        out.println(3 + "Set saving goal");
        out.println(4 + "QUIT");
        out.println("Insert the corresponding number: ");

        try {
            String request = in.readLine();
            switch(request){
                // log transaction
                case "1":
                    // log a set payment (i.e. salary, rent, grocieries, etc.)
                    // log a one-off

                // allowance
                case "2":
                

                // saving goal
                case "3":
                // register saving goal (year)
                // divide saving goal for year in months
                    // return to client how much should be left at end of month
                // store saving goal in csv
                

                // QUIT
                case "4":
                // logic for quitting
            }
        }
        catch(IOException e){
            out.println("Error. Please try again.");
        }



    }
}
