//Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
//—> Courses are: JAVA, PYTHON.
//—> The total fees for java is 10k and for python is 7.5k.
//—> Provide a constructor to take required details.The default course is JAVA.
//—> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).
public class Student {
    
    private static final double JAVA_FEES = 10000;
    private static final double PYTHON_FEES = 7500;

    
    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;

    
    public Student(int admin_no, String stu_name, String course_joined, double fees_paid) {
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = (course_joined.equalsIgnoreCase("PYTHON")) ? "PYTHON" : "JAVA"; // Default is JAVA
        this.fees_paid = fees_paid;
    }


    public Student(int admin_no, String stu_name) {
        this(admin_no, stu_name, "JAVA", 0.0); // Calls the above constructor with default course JAVA and no fees paid
    }

    
    public double getTotalFee() {
        if (course_joined.equalsIgnoreCase("JAVA")) {
            return JAVA_FEES;
        } else {
            return PYTHON_FEES;
        }
    }

    
    public double getDue() {
        return getTotalFee() - fees_paid;
    }

    
    public double getFeePaid() {
        return fees_paid;
    }

    
    public void payment(double amount) {
        if (amount > 0) {
            fees_paid += amount;
            System.out.println("Payment of Rs." + amount + " made successfully. Total fees paid: Rs." + fees_paid);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

   
    public void displayStudentDetails() {
        System.out.println("Admin No: " + admin_no);
        System.out.println("Student Name: " + stu_name);
        System.out.println("Course Joined: " + course_joined);
        System.out.println("Total Fee: Rs." + getTotalFee());
        System.out.println("Fees Paid: Rs." + fees_paid);
        System.out.println("Fees Due: Rs." + getDue());
    }

    
    public static void main(String[] args) {
        
        Student student1 = new Student(1001, "Alice");
        student1.displayStudentDetails();
        student1.payment(3000); // Making a payment
        student1.displayStudentDetails();

        
        Student student2 = new Student(1002, "Bob", "PYTHON", 2500);
        student2.displayStudentDetails();
        student2.payment(2000); 
        student2.displayStudentDetails();
    }
}