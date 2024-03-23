import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExpenseTracker {

    Transactions transac = new Transactions();
    BufferedReader in;
    PrintWriter out;

    public ExpenseTracker(){
        in = new BufferedReader(null);
        out = new PrintWriter(out);
    }

    public static void main(String[] args) {
        

    }


    public void run(){
        boolean running = true;
        while (running){
            out.println("Choose from one of the following options:");
            out.println(1 + ". Create an account");
            out.println(2 + ". Log in");
            out.println(3 + ". QUIT");
            out.println("Enter the number of the options you would like to choose: ");

            try {
                String mode = in.readLine();
                switch(mode){
                    // create an account
                    case "1":


                    // login
                    case "2":


                    // QUIT
                    case "3":
                        running = false;
                        break;

                    default:
                        out.println("Choice was not recognised, please try again.");
                        // need to accept another input
                }
            }
            catch(IOException e){
                out.println("Error. Try again.");
            }
        }
    }

}

/* what to store in csv related to transactions
 * 
 *                      User                    transacName                     amount                   saving goal
 * -------------------------------------------------------------------------------------------------------------------------------
 *                     biggie99              meal out with susy                  -58                       1000
 * 
 * 
*/

/* what to store in csv related to set expenses
 * 
 *                       User                    transacName                     amount
 * --------------------------------------------------------------------------------------------------
 *                      biggie99                   salary                         +500
 *                      biggie99                   groceries                      -70
 * 
 */