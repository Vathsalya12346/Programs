import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Customer implements Comparable<Customer> {
    private String name;
    private String mobileNumber;

    
    public Customer(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    
    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + ", " + mobileNumber;
    }
}

public class CustomerSorter {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        
        String regex = "([A-Za-z ]+),\\s*(\\d{10})";
        Pattern pattern = Pattern.compile(regex);

        
        try (BufferedReader reader = new BufferedReader(new FileReader("customers.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);

                if (matcher.matches()) {
                    String name = matcher.group(1);  
                    String mobileNumber = matcher.group(2);  
                    customers.add(new Customer(name, mobileNumber));
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        
        Collections.sort(customers);

        
        System.out.println("Sorted Customers by Name:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
