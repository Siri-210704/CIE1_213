import java.text.ParseException;

class Employee extends Person {

    String empId;
    double salary;


    public Employee(String name, String dateOfBirth, String empId, double salary) throws ParseException {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
    
}

class Main{
    public static void main(String[] args) throws ParseException {
        Employee e = new Employee("Swati", "2004-08-15", "E2105", 50000.0);
        e.displayEmployeeDetails();
    }
}
