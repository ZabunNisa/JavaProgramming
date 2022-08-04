package day39_Recap.CydeoTask;

public class Employee extends Person{

    private int employeeID;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

       if (employeeID <=0) {
           System.err.println(" Invalid employeeID: " + employeeID);
           System.exit(1);

       }

            this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitile) {
        this.jobTitle = jobTitile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary <= 0) {
            System.err.println("Invalid Salary: " + salary);

            System.exit(1);
        }

        this.salary = salary;
    }

    public void  work(){
        System.out.println(getName() + " is working");

    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "employeeID=" + employeeID +
                ", jobTitile='" + jobTitle + '\'' +
                ", salary= £" + salary +
                '}';
    }
}



/* 2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
*/