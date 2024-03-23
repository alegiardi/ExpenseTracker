import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Class to handle transactions, subtracting and adding to a bank
public class Transactions {

    //List <Pair<String, double>> expenses = new ArrayList<Pair<String, double>>();
    public List<Map.Entry<String,Double>> expenses = new ArrayList<>();
    private double balance;

    public Transactions(){
        // must have access to bank accounts
        // affected balance should be of current account unless a transaction uses savings
    }
    
    public void deposit(String transactionName, double amount){
        balance += amount;
        expenses.add(new AbstractMap.SimpleEntry<>(transactionName,amount));
    }

    public void withdrawal(String transactionName, double amount){
        balance -= amount;
        expenses.add(new AbstractMap.SimpleEntry<>(transactionName,amount));
    }

    public List<Map.Entry<String,Double>> getExpenses(){
        return expenses;
    }
}
