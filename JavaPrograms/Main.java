
class Employee {
    
    private int emp_id;
    private String emp_name;
    private double salary;

    
    public Employee(int emp_id, String emp_name, double salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }

    
    public int getEmpId() {
        return emp_id;
    }

    public String getEmpName() {
        return emp_name;
    }

    public double getSalary() {
        return salary;
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Salary: Rs." + salary);
    }
}


class FactoryEmployee extends Employee {
    
    private int bus_no;
    private boolean emp_boards;

    
    public FactoryEmployee(int emp_id, String emp_name, double salary, int bus_no, boolean emp_boards) {
        
        super(emp_id, emp_name, salary);
        this.bus_no = bus_no;
        this.emp_boards = emp_boards;
    }

   
    public int getBusNo() {
        return bus_no;
    }

    public boolean doesEmpBoard() {
        return emp_boards;
    }

    
    @Override
    public void displayEmployeeDetails() {
        
        super.displayEmployeeDetails();
       
        System.out.println("Bus Number: " + bus_no);
        System.out.println("Boards the Bus: " + (emp_boards ? "Yes" : "No"));
    }

    
    public void updateBoardingStatus(boolean boards) {
        this.emp_boards = boards;
        System.out.println("Boarding status updated to: " + (emp_boards ? "Yes" : "No"));
    }
}


public class Main {
    public static void main(String[] args) {
        
        FactoryEmployee emp1 = new FactoryEmployee(101, "John Doe", 30000, 12, true);

        
        emp1.displayEmployeeDetails();

        
        emp1.updateBoardingStatus(false);

        
        emp1.displayEmployeeDetails();
    }
}
